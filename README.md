# KLUB Progress Documentation: ClubHub

**DECO3500 SEMESTER 2 2017**

**Krista Harrison, Bethany Cave, Lachlan Healey**

## Promotional Material
[Poster](https://github.com/deco3500-2017/klub/blob/master/poster.pdf)
[Brochure](https://github.com/deco3500-2017/klub/blob/master/brochure.pdf)

## Link to Prototype
[Prototype]()

## Startup Guide 

## 1.0 Summary
As a group we were interested in the domain of Active Communities. We were most interested in the UQ Club Hub proposal by Chunnan Zheng.

### 1.1 Problem Space

![Problem Space Description Image](https://github.com/deco3500-2017/klub/blob/master/processDocumentImages/Fig1.png)

Now that we had chosen a project, we set out to do some requirements gathering amongst UQ students involved in Clubs and Societies. In doing so, we sought to understand the gaps and pain points in the existing management solutions used by club members and executives and thus elicit concrete user requirements for our application. 


### Requirements gathering
A survey was undertaken, which had 45 respondents, and focussed  on both members (71.1%) and executives (51.1%) of clubs within The University of Queensland. Some respondents were both a member and executive of one or more clubs, and three respondents (6.7%) noted they were a UQ student, but not a member of any club.

![Requirements Gathering Membership Image](https://github.com/deco3500-2017/klub/blob/master/processDocumentImages/Fig2.png)

Most students found out about their clubs by word of mouth, market day and facebook. 
The problems that arise from this are: 
* Market day only happens once a semester, which means: limited exposure for clubs, especially as they are competing for attention; students can only see so many clubs on the day; students who miss out on market day miss out on one of the main avenues for finding out about clubs 
* Word of mouth relies upon people have connections to students who are already members of a club. This automatically excludes groups of people who aren’t already connected in the Clubs and Societies space. 
* Many people don’t use Facebook or have too much activity to keep up with on Facebook, leading to them missing out on club announcements/activity. Furthermore, clubs that use Facebook pages (as opposed to groups) to communicate with their members can be disadvantaged by the Facebook algorithm, which won’t necessarily ensure that users who like a page will see all of its posts (at least without the club paying for sponsored posts). 

![Requirements Gathering Communication Image](https://github.com/deco3500-2017/klub/blob/master/processDocumentImages/Fig3.png)

Facebook, email and slack are most common channels of communication for clubs in those surveyed. From this we gathered that there must be elements of those platforms which are useful for maintaining a club’s online presence. 

![Requirements Gathering Missed Information Image](https://github.com/deco3500-2017/klub/blob/master/processDocumentImages/Fig4.png)

There are at least some club members who are missing out on events because they don’t 
use the platform the club communicates on regularly. 

### Comments received from users

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

### 1.2 Solution
![Solution to problem space image](https://github.com/deco3500-2017/klub/blob/master/processDocumentImages/Fig5.png)

## 2.0 Design Process

The design process undertook four sprints, utilising a continuous integration agile approach. This meant that the deliverables changed in response to user feedback.


![Flowchart of Design Process Followed](https://github.com/deco3500-2017/klub/blob/master/processDocumentImages/Fig6.png)

### 2.1 Requirements gathering
As discussed in the summary. Full requirements gathering survey can be found [here](https://drive.google.com/open?id=1RX8f_5-7ecg3biKNERLyUZ0BNYmZVsHLftTuJbTUWM4).

### 2.2 Mockup and User Testing

User interviews were conducted with executives of two UQ clubs, and these supported the findings from the requirements survey.

Summaries of user interviews can be found [here](https://github.com/deco3500-2017/klub/issues/4)

After conducting user interviews, a [navigable mockup](https://projects.invisionapp.com/share/AFDEW8V2V) was created, and this was tested with users.

User testing asked participants to perform the following tasks:

![User Testing Tasks for Navigable Mockup Image](https://github.com/deco3500-2017/klub/blob/master/processDocumentImages/Fig7.png)

The following results were obtained: 

![User Testing Results Image](https://github.com/deco3500-2017/klub/blob/master/processDocumentImages/Fig8.png)

We then moved onto implementing our first prototype. Changes were made as a result of the initial testing, including notifications when a club has been joined, and the inclusion of the calendar in the navigation bar.

### 2.3 Initial Prototype and User Testing
The initial prototype was tested with users at the showcase. The prototype provided basic integration with the backend (ability to register, login, and search). Users were able to navigate the prototype themselves, or view a demonstration.

![Initial Prototype Welcome Screen](https://github.com/deco3500-2017/klub/blob/master/processDocumentImages/Fig9.JPG)

![Initial Prototype Search Screen](https://github.com/deco3500-2017/klub/blob/master/processDocumentImages/Fig10.png)

![Initial Prototype Robogals Screen](https://github.com/deco3500-2017/klub/blob/master/processDocumentImages/Fig11.png)

The following results were obtained from talking with users at the showcase:

![Results from Showcase User Testing](https://github.com/deco3500-2017/klub/blob/master/processDocumentImages/Fig12.png)

We then moved into implementing our second prototype, taking on board feedback about branding, and tag searching.

### 2.4 Second Prototype

The second prototype implemented a fully styled website. Users are now able to see information about the purpose of the site from the landing page, view a news feed of the next five events and top news items from their clubs,  and search by tags as well as club names. Events can also be added to the calendar by executives, and these can be viewed by members.


![Welcome Screen on Second Prototype](https://github.com/deco3500-2017/klub/blob/master/processDocumentImages/Fig13.png)

![Search Page on Second Prototype](https://github.com/deco3500-2017/klub/blob/master/processDocumentImages/Fig14.png)

![Event adding by Executive on Second Prototype](https://github.com/deco3500-2017/klub/blob/master/processDocumentImages/Fig15.png)

### 2.5 Limitations and Future Developments

Not all features identified through interaction with users have been implemented in the current prototype. We faced limits in the user groups we could meet, and if the project was to continue, it would be beneficial to branch our user research further afield within the UQ Clubs community.

* In terms of functionality, a future sprint would ideally implement the following:
* Use of UQ single signon for registering
* Ability to log in and out
* Faculty based searching
* Push notification for event creation/cancellation
* Club branding on individual pages (this was unable to be obtained for the current state)
* Separate page under my clubs listing those the user is a member of
* Integration with UQ academic calendar

## 3.0  Team Roles

The roles for each team member can be viewed on the following system architecture diagram.

![System Architecture Diagram with Team Roles](https://github.com/deco3500-2017/klub/blob/master/processDocumentImages/Fig16.png)

Specific work done by each team member can be seen under [issues](https://github.com/deco3500-2017/klub/issues), where each member is assigned to the issues they worked on. Individual code contributions can be seen under Insights: [Lachlan](https://github.com/deco3500-2017/klub/commits?author=Leggy), [Beth](https://github.com/deco3500-2017/klub/commits?author=bethcave) and [Krista](https://github.com/deco3500-2017/klub/commits?author=kristasusanne). 
