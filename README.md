# Hackforge Event Discord Bot
This is a bot written for the Hackforge Discord server. It does three things:
1. People can ask the bot when the next event is
2. People can ask the bot how to join Hackforge
3. The bot will remind people of an event happening the next day
4. NEW: You can query the events using a SQL-Like language

It gets it's information on events by retreiving and then attempting to parse http://hackf.org.


## Now with HEQL!
As part of a Software Guild session on parsing languages with grammars, hackfeventbot now parses a SQL-Like language called HEQL (Hackforge Event Query Language, pronounced "heckle"). Below are some examples of executing HEQL.


### Select the Next Event:
```
Hey @hackforgeeventbot can you get me the next event
<?heql 
SELECT NEXT title, content, excerpt, start_date_time, end_date_time, meetup_link, facebook_link, group
FROM events?> | pretty
```
![A Simple HEQL Query](https://github.com/johnhaldeman/hackfeventbot/raw/master/screenshots/SimpleHEQL.png)


### Select Next Software Guild Event About Grammars and output as JSON:
```
Hey @hackfeventbot can you get me the next event
<?heql 
SELECT NEXT title, content, excerpt, start_date_time, end_date_time, meetup_link, facebook_link, group
FROM events
WHERE group = 'Software Guild' and title LIKE '%Grammar%'
?> | json
```
![A Simple HEQL Query](https://github.com/johnhaldeman/hackfeventbot/raw/master/screenshots/HEQLwConditions.png)


### Select something and have a hammer output the results
```
Hey @hackfeventbot can you get me those links but make it look like a hammer is saying it because that’s awesome
<?heql
SELECT NEXT title, group, facebook_link
FROM events 
WHERE group = 'Software Guild' and title LIKE '%Grammar%';
?> | hammersay
```
![A Simple HEQL Query](https://github.com/johnhaldeman/hackfeventbot/raw/master/screenshots/HEQLHammersay.png)


### Select distinct values for a specific field to help with other queries
```
Hey @hackfeventbot what groups are there to choose from?
<?heql 
SELECT DISTINCT group
     FROM events;
?>
```
![A Simple HEQL Query](https://github.com/johnhaldeman/hackfeventbot/raw/master/screenshots/HEQLDistinct.png)


## Other Screenshots
Asking for help:
![Asking for help](https://github.com/johnhaldeman/hackfeventbot/raw/master/screenshots/help.png "Asking for help")

Asking about membership:
![Asking about membership](https://github.com/johnhaldeman/hackfeventbot/raw/master/screenshots/membership.png "Asking about membership")

Asking about the next event:
![Asking about events](https://github.com/johnhaldeman/hackfeventbot/raw/master/screenshots/nextEvent.png "Asking about events")

Getting reminded about the next event:
![Reminder about event](https://github.com/johnhaldeman/hackfeventbot/raw/master/screenshots/reminder.png "Reminder about event")

## Dependancies:

* Discord4J Java Interface into the Discord API: https://github.com/austinv11/Discord4J
* GSon Java JSON Parser: https://github.com/google/gson
* Apache Commons IO: https://commons.apache.org/proper/commons-io/
* Apache HTTP Components HTTP Client: http://hc.apache.org/
* jsoup Java HTML Parser: https://jsoup.org/ 
