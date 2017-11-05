# KLUB PROGRESS DOCUMENATATION: ClubHub

**DECO3500 SEMESTER 2 2017**

**Krista Harrison, Bethany Cave, Lachlan Healey**

## Promotional Material
![Poster](https://githubusercontent.com/deco3500-2017/klub/blob/master/poster.pdf)
[Brochure](https://github.com/deco3500-2017/klub/blob/master/brochure.pdf)

#Link to Prototype
[Prototype]()
###Start up guide 

##1.0 Summary
As a group we were interested in the domain of Active Communities. We were most interested in the UQ Club Hub proposal by Chunnan Zheng.

##1.1 Problem space

![ALt text](https://github.com/deco3500-2017/klub/blob/master/Process%20Document%20Images/Fig.%201.png “Fig. 1 - Initial interest in idea”)

Now that we had chosen a project, we set out to do some requirements gathering amongst UQ students involved in Clubs and Societies. In doing so, we sought to understand the gaps and pain points in the existing management solutions used by club members and executives and thus elicit concrete user requirements for our application. 


###Requirements gathering
A survey was undertaken, which had 45 respondents, and focussed  on both members (71.1%) and executives (51.1%) of clubs within The University of Queensland. Some respondents were both a member and executive of one or more clubs, and three respondents (6.7%) noted they were a UQ student, but not a member of any club.

![](https://github.com/deco3500-2017/klub/blob/master/Process%20Document%20Images/Fig.%202.png “Fig. 2 - requirements gathering: club discovery”)

Most students found out about their clubs by word of mouth, market day and facebook. 
The problems that arise from this are: 
Market day only happens once a semester, which means: limited exposure for clubs, especially as they are competing for attention; students can only see so many clubs on the day; students who miss out on market day miss out on one of the main avenues for finding out about clubs 
Word of mouth relies upon people have connections to students who are already members of a club. This automatically excludes groups of people who aren’t already connected in the Clubs and Societies space. 
Many people don’t use Facebook or have too much activity to keep up with on Facebook, leading to them missing out on club announcements/activity. Furthermore, clubs that use Facebook pages (as opposed to groups) to communicate with their members can be disadvantaged by the Facebook algorithm, which won’t necessarily ensure that users who like a page will see all of its posts (at least without the club paying for sponsored posts). 

![](https://github.com/deco3500-2017/klub/blob/master/Process%20Document%20Images/Fig.%203.png “Fig. 3 - requirements gathering: club communication”)

Facebook, email and slack are most common channels of communication for clubs in those surveyed. From this we gathered that there must be elements of those platforms which are useful for maintaining a club’s online presence. 




![](https://github.com/deco3500-2017/klub/blob/master/Process%20Document%20Images/Fig.%204.png “Fig. 4 - requirements gathering: missing out”)

There are at least some club members who are missing out on events because they don’t 
use the platform the club communicates on regularly. 



###Comments received from users

We received the following comments in response to the question: “For club members: do you experience any difficulties or frustrations due to the way the clubs of which you are a member communicate? (eg. difficult to sign up, difficult to find out when events are on, difficult to communicate with other members/executives etc.)”. 

| Comments      |
| ------------- |
|Sometimes it's easy to miss an event if they only put up an event thing on Facebook and don't send out an email or notification|
|Often require sign up to be in person|
|Sometimes I wish they'd communicate more often or be more clear about what events are happening.|
|Yes. I used to be exec on a club I am now just a member of and get frustrated that people aren't personally invited anymore it's just 'hope they see it on Facebook/click the club page'|
|Yes. The club execs tend to be clique-y and the General Assembly to vote new exec is nothing more than a popularity contest|
|There should be online sign up as I work and can't always attend events, or market day, but do enjoy contact online.|
|The spam with FB events is too much which causes me to disengage from the online space.|
|Sometimes the executives seems closed in.|
|Some clubs have no central hub distributing information about events|
|Not getting emails.|
|Yes, organisation is sometimes last minute.|

The most important requirements we gathered from this process were:

Users need a way to find out about clubs (not just through market day, facebook etc.).
Most common platforms are: facebook, slack, email. We need to find out what the good elements of these are (since they must have something good about them bc everyone is using them) and then incorporate these aspects into our solution.
People are definitely missing out on events because the way they use social media doesn’t match up with how their clubs use social media. Having a central solution as means everyone can access it.
Some useful functionality (eg. sign up to clubs, paying membership fees) is completely absent from current solutions. We can fill these gaps in our solution.

##1.2 Solution
![](https://github.com/deco3500-2017/klub/blob/master/Process%20Document%20Images/Fig.%205.png “Fig. 5 - Solution to problem space”)

##2.0 Design Process

The design process undertook four sprints, utilising a continuous integration agile approach. This meant that the deliverables changed in response to user feedback.


![](https://github.com/deco3500-2017/klub/blob/master/Process%20Document%20Images/Fig.%206.png “Fig. 6 - Flowchart of design process followed”)


##2.1 Requirements gathering
As discussed in the summary. Full requirements gathering survey can be found [here](https://drive.google.com/open?id=1RX8f_5-7ecg3biKNERLyUZ0BNYmZVsHLftTuJbTUWM4).

##2.2 Mockup and User Testing

User interviews were conducted with executives of two UQ clubs, and these supported the findings from the requirements survey.

Summaries of user interviews can be found [here](https://github.com/deco3500-2017/klub/issues/4)

After conducting user interviews, a [navigable mockup](https://projects.invisionapp.com/share/AFDEW8V2V) was created, and this was tested with users.

User testing asked participants to perform the following tasks:

![](https://github.com/deco3500-2017/klub/blob/master/Process%20Document%20Images/Fig.%207.png “Fig. 7 - User testing tasks for navigable mockup”)

The following results were obtained: 


![](https://github.com/deco3500-2017/klub/blob/master/Process%20Document%20Images/Fig.%208.png “Fig. 8 - Results from navigable mockup testing session”)

We then moved onto implementing our first prototype. Changes were made as a result of the initial testing, including notifications when a club has been joined, and the inclusion of the calendar in the navigation bar.

##2.3 Initial Prototype and User Testing
The initial prototype was tested with users at the showcase. The prototype provided basic integration with the backend (ability to register, login, and search). Users were able to navigate the prototype themselves, or view a demonstration.

![](https://github.com/deco3500-2017/klub/blob/master/Process%20Document%20Images/Fig.%209.png “Fig. 9 - Welcome page from initial prototype”)




![](https://github.com/deco3500-2017/klub/blob/master/Process%20Document%20Images/Fig.%2010.png “Fig. 10 - Search page from initial prototype”)




![](https://github.com/deco3500-2017/klub/blob/master/Process%20Document%20Images/Fig.%2011.png “Fig. 11 - Club page from initial prototype”)

The following results were obtained from talking with users at the showcase:


![](https://github.com/deco3500-2017/klub/blob/master/Process%20Document%20Images/Fig.%2012.png “Fig. 12 - Results from showcase user testing”)
			
We then moved into implementing our second prototype, taking on board feedback about branding, and tag searching.

##2.4 Second Prototype

The second prototype implemented a fully styled website. Users are now able to see information about the purpose of the site from the landing page, view a news feed of the next five events and top news items from their clubs,  and search by tags as well as club names. Events can also be added to the calendar by executives, and these can be viewed by members.


![](https://github.com/deco3500-2017/klub/blob/master/Process%20Document%20Images/Fig.%2013.png “Fig. 13 - Welcome screen on second prototype”)


![](https://github.com/deco3500-2017/klub/blob/master/Process%20Document%20Images/Fig.%2014.png “Fig. 14 - Search page on second prototype”)

![](https://github.com/deco3500-2017/klub/blob/master/Process%20Document%20Images/Fig.%2015.png “Fig. 15 - Even adding by executive on second prototype”)

##2.5 Limitations and Future Developments
Not all features identified through interaction with users have been implemented in the current prototype. We faced limits in the user groups we could meet, and if the project was to continue, it would be beneficial to branch our user research further afield within the UQ Clubs community.

In terms of functionality, a future sprint would ideally implement the following:
Use of UQ single signon for registering
Ability to log in and out
Faculty based searching
Push notification for event creation/cancellation
Club branding on individual pages (this was unable to be obtained for the current state)
Separate page under my clubs listing those the user is a member of
Integration with UQ academic calendar

##3.0  Team Roles

The roles for each team member can be viewed on the following system architecture diagram.


Figure 5.1 - System architecture diagram with team roles
![](https://github.com/deco3500-2017/klub/blob/master/Process%20Document%20Images/Fig.%2016.png “Fig. 16 - System architecture diagram with team roles”)

Specific work done by each team member can be seen under [issues](https://github.com/deco3500-2017/klub/issues), where each member is assigned to the issues they worked on. Individual code contributions can be seen under Insights: [Lachlan](https://github.com/deco3500-2017/klub/commits?author=Leggy), [Beth](https://github.com/deco3500-2017/klub/commits?author=bethcave) and [Krista](https://github.com/deco3500-2017/klub/commits?author=kristasusanne). 
