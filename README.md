# Hackforge Event Discord Bot
This is a bot written for the Hackforge Discord server. It does three things:
1. People can ask the bot when the next event is
2. People can ask the bot how to join Hackforge
3. The bot will remind people of an event happening the next day

It gets it's information on events by retreiving and then attempting to parse http://hackf.org.

## Screenshots
Asking for help:
![alt text](https://github.com/johnhaldeman/hackfeventbot/raw/master/screenshots/help.png "Asking for help")

Asking about membership:
![alt text](https://github.com/johnhaldeman/hackfeventbot/raw/master/screenshots/membership.png "Asking about membership")

Asking about the next event:
![alt text](https://github.com/johnhaldeman/hackfeventbot/raw/master/screenshots/nextEvent.png "Asking about events")

Getting reminded about the next event:
![alt text](https://github.com/johnhaldeman/hackfeventbot/raw/master/screenshots/reminder.png "Reminder about event")

## Dependancies:

* Discord4J Java Interface into the Discord API: https://github.com/austinv11/Discord4J
* GSon Java JSON Parser: https://github.com/google/gson
* Apache Commons IO: https://commons.apache.org/proper/commons-io/
* Apache HTTP Components HTTP Client: http://hc.apache.org/
* jsoup Java HTML Parser: https://jsoup.org/ 
