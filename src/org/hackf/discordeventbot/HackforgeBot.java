package org.hackf.discordeventbot;
import sx.blah.discord.api.ClientBuilder;
import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.api.events.EventDispatcher;

import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class HackforgeBot {
	static IDiscordClient cli;

	public static void main(String[] args) throws JsonSyntaxException, JsonIOException, IOException {
		
		HackforgeSiteParser siteParse = new HackforgeSiteParser();
		HackforgeEventFromSite event = siteParse.getNextEvent();
		
		String message = "This is the next event I've been able to find on hackf.org "
				+ "(and was successfully able to parse):\n\n"
				+ event.toDiscordMessage();
		System.out.println( message );
		
		if(args.length != 1){
			System.out.println("usage:");
			System.out.println("    java -jar HackforgeBot.jar <config_file>");
		}
		
		Gson gson = new Gson();
		HackforgeBotConfig config = gson.fromJson(new FileReader(args[0]), HackforgeBotConfig.class);
		
		
		cli = new ClientBuilder().withToken(config.getBottoken()).build();
		cli.login();
		
		EventDispatcher dispatcher = cli.getDispatcher(); // Gets the EventDispatcher instance for this client instance
        dispatcher.registerListener(new HackforgeBotEventListener(cli, config)); // Registers the IListener example class from above
        
	}
}
