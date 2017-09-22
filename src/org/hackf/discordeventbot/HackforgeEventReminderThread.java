package org.hackf.discordeventbot;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import sx.blah.discord.handle.obj.IChannel;

public class HackforgeEventReminderThread implements Runnable{
	IChannel channel;

	public HackforgeEventReminderThread(IChannel channel){
		this.channel = channel;
	}
	
	@Override
	public void run() {
		while(true){
			
			Date now = new Date();
			// Uncomment below to test future dates
			//now = new Date(1494368460000L);
			Calendar calendarNow = Calendar.getInstance();
			calendarNow.setTime(now);
			calendarNow.add(Calendar.DATE, 1); 
			Date nowPlus1Day = calendarNow.getTime();
					
			calendarNow.setTime(now);
			calendarNow.add(Calendar.DATE, 1); 
			calendarNow.add(Calendar.HOUR, 1); 
			Date nowPlus1Day1Hour = calendarNow.getTime();
			
			HackforgeSiteParser siteParse = new HackforgeSiteParser();
			
			try {
				HackforgeEventFromSite event = siteParse.getEventBetween(nowPlus1Day, nowPlus1Day1Hour);
				
				if(event != null)
					channel.sendMessage("Hey Hackforgers. Just a reminder, the following event is "
							+ "happening around this time tomorrow! \n\n" +
							event.toDiscordMessage());
			} catch (IOException e1) {
				e1.printStackTrace();
			}

			System.out.println("Sleeping 1 hour");
			try {
				Thread.sleep(60 * 60 * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
