package org.hackf.discordeventbot;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;

public class HackforgeSiteParser {
	
	public HackforgeEventFromSite getNextEvent() throws IOException {
			
			HackforgeEventFromSite[] allEvents = getAllEvents();
					    
		    return getUpcoming(Arrays.asList(allEvents));
	}
	
	public HackforgeEventFromSite getUpcoming(List<HackforgeEventFromSite> allEvents){
		Date now = new Date();
		System.out.println("Nowtime:" + now.getTime());
		HackforgeEventFromSite nextEvent = null;
		for (HackforgeEventFromSite event: allEvents){
			if (event.getStart_date_time() > now.getTime()){
				if(nextEvent == null)
					nextEvent = event;
				else if(nextEvent.getStart_date_time() > event.getStart_date_time())
					nextEvent = event;
			}
		}
		return nextEvent;
	}

	public HackforgeEventFromSite[] getAllEvents() throws IOException {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet("http://hackf.org/events/?json=true");
		CloseableHttpResponse response1 = null;

		response1 = httpclient.execute(httpGet);
		HttpEntity entity1 = response1.getEntity();
		String html = IOUtils.toString(entity1.getContent(), "UTF-8");
		EntityUtils.consume(entity1);
			
		Gson gson = new Gson();
		HackforgeEventFromSite[] events = gson.fromJson(html, HackforgeEventFromSite[].class);			
			
		return events;
	}

	public HackforgeEventFromSite getEventBetween(Date nowPlus1Day, Date nowPlus1Day1Hour) throws IOException {
		System.out.println("checking: ");
		System.out.println(nowPlus1Day);
		System.out.println(nowPlus1Day.getTime());
		System.out.println(nowPlus1Day1Hour);
		System.out.println(nowPlus1Day1Hour.getTime());
		HackforgeEventFromSite[] allEvents = getAllEvents();	    
		for(int i = 0; i < allEvents.length; i++){			
			if(allEvents[i].getStart_date_time() >= nowPlus1Day.getTime()
					&& allEvents[i].getStart_date_time() < nowPlus1Day1Hour.getTime())
				return allEvents[i];
	    }
		return null;
	}
	
}
