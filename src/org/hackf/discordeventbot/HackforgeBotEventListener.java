package org.hackf.discordeventbot;
import java.io.IOException;
import java.util.List;
import java.util.Vector;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.api.events.EventSubscriber;
import sx.blah.discord.handle.impl.events.ReadyEvent;
import sx.blah.discord.handle.impl.events.guild.channel.message.MentionEvent;
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent;
import sx.blah.discord.handle.obj.IChannel;
import sx.blah.discord.handle.obj.IMessage;

public class HackforgeBotEventListener { // The event type in IListener<> can be any class which extends Event
		IDiscordClient cli;
		HackforgeBotConfig config;
	
		public HackforgeBotEventListener(IDiscordClient cli, HackforgeBotConfig config){
			this.cli = cli;
			this.config = config;
		}
		
	    @EventSubscriber
	    public void onReadyEvent(ReadyEvent event) {
			IChannel channel = cli.getChannelByID(config.getDebugchannel());
			HackforgeEventReminderThread rem = new HackforgeEventReminderThread(channel);
			Thread reminderThread = new Thread(rem);
			reminderThread.start();
	    }
	    
	    @EventSubscriber
	    public void onMessageReceived(MessageReceivedEvent event){
	    	if(event.getChannel().isPrivate())
	    		processMessage(event.getMessage());
	    }
	    
		@EventSubscriber
	    public void onMentionEvent(MentionEvent event){
			if(event.getMessage().getContent().contains("@309853728687652864"))
				processMessage(event.getMessage());
	    }
	    
	    private void processMessage(IMessage message) {
	    	String messageString = "";
	    	
	    	if(message.getContent().toLowerCase().contains("<?heql")){
	    		HEQLParsingController cont = new HEQLParsingController();
	    		try {
					HEQLBotListener listener = cont.parse(message.getContent().trim());
					
					if(cont.hasError()){
						message.getChannel().sendMessage("I'm sorry, I don't understand the query\n" +
								cont.getErrorMessage());
						return;
					}
					
					Gson gson = new Gson();
					System.out.println(gson.toJson(listener.getFieldList()));
					System.out.println(listener.getConditionTreeRoot().conditionsTreeToString(1));
					
					HackforgeSiteParser siteParse = new HackforgeSiteParser();
					HackforgeEventFromSite[] events = siteParse.getAllEvents();
					
					Vector<HackforgeEventFromSite> matchingevents = new Vector<HackforgeEventFromSite>();
					
					for(HackforgeEventFromSite event: events){
						if(listener.getConditionTreeRoot().evaluate(event)){
							matchingevents.add(event);
						}
					}					

					if(listener.getType() == HEQLBotListener.TYPE_SELECT_NEXT)
						messageString = getNextEventText(matchingevents, listener.getFieldList(), listener.getFormat());
					else if(listener.getType() == HEQLBotListener.TYPE_SELECT_DISTINCT)
						messageString = getDistinctText(matchingevents, listener.getFieldList());
					else if(listener.getType() == HEQLBotListener.TYPE_BASE_SELECT)
						messageString = getAllEventText(matchingevents, listener.getFieldList());
					else
						messageString = "You seemed to submit a HEQL query, but I didn't understand it.";
				} 
	    		catch (IOException e) {
					e.printStackTrace();
				}
	    		
	    	}
	    	else if(message.getContent().toLowerCase().contains("help")){
	    		messageString = "I am just a simple country bot that does one thing:"
		    			+ " I tell you when the next Hackforge Event is (well, I try my best at least "
		    			+ "in parsing hackf.org and figuring it out)\n\n"
		    			+ "To find out about the next Hackforge event mention me or personal message me again and include the word \"event\"\n"
		    			+ "To find out about how to get a membership include the word \"membership\" instead\n";
	    		message.addReaction(":ok_hand:");
	    	}
	    	else if (message.getContent().toLowerCase().contains("member")){
	    		messageString = "I am so glad you asked! Membership is an important part of "
	    				+ "allowing Hackforge to continue doing what it does. It's a great way to give back "
	    				+ "to the Hackforge community and has some other great benefits as well. "
	    				+ "You can find out more and how to join here: http://hackf.org/join-us/";
	    	}
	    	else if (message.getContent().toLowerCase().contains("event")){
	    		message.getChannel().sendMessage("I'm going to try get the next event....");
	    		messageString = getNextEventText();
	    	}
	    	else {
	    		messageString = "Hi! I'm the Hackforge Event Bot. To get some help on what I can do "
	    				+ "mention or personal message me again and include the word \"help\"";
	    	}
	    	
	    	message.getChannel().sendMessage(messageString);
		}
	    
	    private String getDistinctText(Vector<HackforgeEventFromSite> matchingevents, Vector<String> fieldList) {
	    	String field = fieldList.get(0);
			String message = "Here's a list of distinct values for the field **" + fieldList.get(0) + "**:";
			
			Vector<String> displayed = new Vector<String>();
			message += "\n----------------------";
				
			for(HackforgeEventFromSite event: matchingevents){
				String value = event.getFieldValue(field);
				if(!displayed.contains(value)){
					message += "\n" + event.getFieldValue(field);
					displayed.add(value);
				}
			}
			message += "\n----------------------";
				
			return message;
		}
	    
	    private String getNextEventText(List<HackforgeEventFromSite> list, Vector<String> fieldList, String format){
			HackforgeSiteParser siteParse = new HackforgeSiteParser();
			HackforgeEventFromSite event = siteParse.getUpcoming(list);
			
			String message = "";
			if(format.equals("json"))
				message = "```\n" + event.toJson(fieldList) + "```\n";
			else if(format.equals("hammersay"))
				message = event.toHammerSay(fieldList);
			else
				message = event.toDiscordMessage();
			return message;
	    }	  
	    
	    
	    private String getAllEventText(List<HackforgeEventFromSite> list, Vector<String> fieldList){
	    	Vector<JsonObject> objects = new Vector<JsonObject>();
	    	for(HackforgeEventFromSite event: list){
	    		JsonObject obj = event.toJsonObject(fieldList);
	    		objects.add(obj);
	    	}
	    	Gson gson = new GsonBuilder().setPrettyPrinting().create();
		    String prettyJson = gson.toJson(objects);
		    
	    	return "```\n" + prettyJson + "```\n";
	    }
	    
		private String getNextEventText(){
			try {
				HackforgeSiteParser siteParse = new HackforgeSiteParser();
				HackforgeEventFromSite event = siteParse.getNextEvent();
				
				String message = "This is the next event I've been able to find on hackf.org:\n\n"
						+ event.toDiscordMessage();
				return message;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}



	}
