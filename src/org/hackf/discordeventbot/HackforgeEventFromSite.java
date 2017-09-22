package org.hackf.discordeventbot;

import java.util.Date;
import java.util.Vector;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class HackforgeEventFromSite {
    private String title;
    private String content;
    private String excerpt;
    private long start_date_time;
    private long end_date_time;
    private String admission_cost;
    private String meetup_link;
    private String facebook_link;
    private String group;
    
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getExcerpt() {
		return excerpt;
	}
	public void setExcerpt(String excerpt) {
		this.excerpt = excerpt;
	}
	public long getStart_date_time() {
		return (start_date_time * 1000) + 14400000;
	}
	public void setStart_date_time(long start_date_time) {
		this.start_date_time = start_date_time;
	}
	public long getEnd_date_time() {
		return (end_date_time  * 1000) + 14400000;
	}
	public void setEnd_date_time(long end_date_time) {
		this.end_date_time = end_date_time;
	}
	public String getAdmission_cost() {
		return admission_cost;
	}
	public void setAdmission_cost(String admission_cost) {
		this.admission_cost = admission_cost;
	}
	public String getMeetup_link() {
		return meetup_link;
	}
	public void setMeetup_link(String meetup_link) {
		this.meetup_link = meetup_link;
	}
	public String getFacebook_link() {
		return facebook_link;
	}
	public void setFacebook_link(String facebook_link) {
		this.facebook_link = facebook_link;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	
	public String toDiscordMessage(){
		
		Date date = new Date(this.getStart_date_time());
		
		String message =  "**__" + getTitle() + "__**\n\n"
				+ "*" + date + "*\n"
				+ "" + this.getContent() + "\n"
				+ "\n";
		message += "          " + this.getFacebook_link() + "\n"; 
		message += "          " + this.getMeetup_link() + "\n"; 
		message += "\nYou should go. I'm sure it'll be fun!";
		
		return message;
	}
	public String toJson(Vector<String> fieldList) {
		JsonObject object = toJsonObject(fieldList);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
	    String prettyJson = gson.toJson(object);
	    		  
		return prettyJson;
	}
	
	public JsonObject toJsonObject(Vector<String> fieldList) {
		JsonObject object = new JsonObject();
				
		addToJson(object, fieldList, "title", title);
		addToJson(object, fieldList, "content", content);
		addToJson(object, fieldList, "excerpt", excerpt);
		addToJson(object, fieldList, "start_date_time", new Date(getStart_date_time()).toString());
		addToJson(object, fieldList, "end_date_time", new Date(getEnd_date_time()).toString());
		addToJson(object, fieldList, "admission_cost", admission_cost);
		addToJson(object, fieldList, "meetup_link", meetup_link);
		addToJson(object, fieldList, "facebook_link", facebook_link);
		addToJson(object, fieldList, "group", group);
		
		return object;
	}
	
	private void addToJson(JsonObject object, Vector<String> fieldList, String name, String value){
		if(fieldList.contains(name) || fieldList.isEmpty())
			object.addProperty(name, value);
	}
	
	public String toHammerSay(Vector<String> fieldList) {
		StringBuilder bld = new StringBuilder();

		bld.append("```\n\n");

		bld.append(" ____________________________________________________________________________ \n");
		addToHammerSay(bld, fieldList, "title", title);
		addToHammerSay(bld, fieldList, "content", content);
		addToHammerSay(bld, fieldList, "excerpt", excerpt);
		addToHammerSay(bld, fieldList, "start_date_time", new Date(getStart_date_time()).toString());
		addToHammerSay(bld, fieldList, "end_date_time", new Date(getEnd_date_time()).toString());
		addToHammerSay(bld, fieldList, "admission_cost", admission_cost + " ");
		addToHammerSay(bld, fieldList, "meetup_link", meetup_link);
		addToHammerSay(bld, fieldList, "facebook_link", facebook_link);
		addToHammerSay(bld, fieldList, "group", group);
		bld.append(" ---------------------------------------------------------------------------- \n");
		bld.append("                                                   \\                 \n");
		bld.append("                                                    \\    ____        \n");
		bld.append("                                                  ___\\__/____|_____  \n");
		bld.append("                                                 /                 \\ \n");
		bld.append("                                                 |     hammer      | \n");
		bld.append("                                                 |        time     | \n");
		bld.append("                                                 \\_________________/ \n");
		bld.append("                                                         |  |        \n");
		bld.append("                                                         |  |        \n");
		bld.append("                                                         |  |        \n");
		bld.append("                                                         |  |        \n");
		bld.append("```");
		
		return bld.toString();
	}
	
	private void addToHammerSay(StringBuilder sb, Vector<String> fieldList, String name, String value){
		System.out.println(value);
		if(value.length() + name.length() + 2 > 70)
			value = value.substring(0, 70 - (name.length() + 2)) + "...";
		System.out.println(value);
		String padded = value;
		if(value.length() > 0)
			padded = value + "                                                                           ".substring(value.length() + name.length() + 2);
		
		if(fieldList.contains(name) || fieldList.isEmpty()){
			sb.append("< ").append(name).append(": " ).append(padded).append(">\n") ;
		}
	}
	public String getFieldValue(String field) {
		if(field.equals("title")) return title;
		if(field.equals("content")) return content;
		if(field.equals("excerpt")) return excerpt;
		if(field.equals("start_date_time")) return new Date(getStart_date_time()).toString();
		if(field.equals("end_date_time")) return new Date(getEnd_date_time()).toString();
		if(field.equals("admission_cost")) return admission_cost;
		if(field.equals("meetup_link")) return meetup_link;
		if(field.equals("facebook_link")) return facebook_link;
		if(field.equals("group")) return group;
		
		return "";
	}
    
}
