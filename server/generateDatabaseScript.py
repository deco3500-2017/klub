import requests

ADD_USER_URL = "http://localhost:8080/users/"
ADD_CLUB_URL = "http://localhost:8080/clubs/"
ADD_MEMBER_URL = "http://localhost:8080/clubs/{}/members/{}"
ADD_EXECUTIVE_URL = "http://localhost:8080/clubs/{}/executives/{}"


users = [('MegaBeth', 'ilovecats', 'Beth Cave', 'beth@clubcub.com', 's1234567'), 
		('Leggy', 'iloveducks', 'Lachlan Healey', 'leggy@cluhub.com', 's1234555'),
		('krista', '<3cats', 'Krista Harrison', 'someemail', 's1231232')]

clubs = [('robogals', 'Robogals UQ', 'We have a friendly, warm and genuine culture which provides support for club members. Robogals offers opportunities to develop skills such as public speaking and communication skills. Additionally, we connect university students to companies that value a gender inclusive workplace.\nAll faculties are welcome as we provide training.\nThroughout the year, Robogals holds numerous events including: (all events are not age restrictive)\n - Launch nights welcoming volunteers with pizza and board games.\n - Volunteer-run workshops for school students\n - Rural trips where volunteers travel to rural Queensland for a week to inspire young minds. Past locations have included: Sunshine Coast, Gladstone and Townsville\n - An Industry Gala to connect university students to companies that value a gender inclusive workplace\n - Social events: from having lunch to bowling and laser tag!', 'We encourage school aged girls to pursue Science, Technology, Engineering and Math (STEM) through holding workshops at schools, universities and libraries because diversity drives innovation.', 'robogals.png', 2, 'volunteering\ndiversity', 'https://robogalsbrisbane.org/', 'https://www.facebook.com/groups/robogalsVolunteers/', 'https://twitter.com/RobogalsBris'),
		('uqrobotics', 'UQ Robotics', 'Our aim is to help you have fun, learn a lot and improve your technical skills. We hope to connect students interested in robotics and technology to other students, staff and mentors. As well as connecting you to labs and projects that may help, teach and bring out your own technical skills.\nWe hope that by doing all this we can help improve your uni experience!\nSee you at our next event!', 'Hobbyist Robotics club based at UQ.', 'robotics.png', 5, 'electronics, electrical, software, mechatronic, soldering, hardware, firmware, arduino, robot', 'http://uqrobotics.com/', 'https://www.facebook.com/groups/uqrobotics/', ''),
		('pokemon', 'Pokemon Fan Club of UQ', 'We host regular events which are spread across all aspects of the Pokémon franchise.\nThe most popular events that we host are our St Lucia Pokémon League Days, where you can use your Town Map to challenge our Gym Leaders across campus and win badges. If you win 8 badges, you can challenge our Elite 4 and become the St Lucia Pokémon Champion. We also host regular trivia nights, anime and movie screenings, Trading Card Game tournaments, Pokémon Showdown competitions, and picnics.\nOur events are posted to our Facebook page and group, as well as our newly built and designed website. Importantly, annual membership can be purchased at any of our events for the low cost of $3, and you do not need to be a UQ student to sign up.\nWe hope to see you there!', 'The UQ Pokemon Fan Club aims to promote a broad range of events for all sorts of Pokemon fans.', 'pokemon.png', 3, 'pokemon\ntrading cards\nanime\nmanga\nvideo games', 'http://pfcuq.wikidot.com/', 'https://www.facebook.com/groups/PokemonfanclubofUQ/', ''),
		('games', 'Queensland University Games Society', 'QUGS, a UQ Union affiliated club, has a special focus on board games and card games including a Magic: the Gathering playgroup that meets regularly. QUGS members include avid gamers of all types including roleplayers, wargamers, chess, video gamers etc.\nMembership costs $5.00 for the year and being a student is not required. Everybody from complete novices to hard-core gamers is welcome.\nWe meet on Mondays at 5:00pm and the first Saturday of each month for board games. In addition we meet at 4:00pm on Thursdays for casual Magic: the Gathering with a draft starting at 6:00pm. Barring Christmas or a natural disaster, QUGS meetings are always on.', 'Casual board and card game orientated group.', 'games.png', 5, 'board games\ngames\ngame\ntabletop\nmagic', '', 'https://www.facebook.com/groups/QUBGS/', ''),
		('harrypotter', 'Harry Potter Alliance', 'We strive to create an environment where you can meet likeminded people in an enjoyable setting. We share in our love for Harry Potter with regular events including movie nights, trivia, and quidditch.\nAll year long the four houses compete for the glory of the Hogwarts House Cup. So dust off those broomsticks, fasten your cloak, and wands out- come join the HPA!', 'UQHPA is a place where witches and wizards and magical beasts all come together for a laugh.', 'harrypotter.png', 2, 'social\nharry potter\nsport\nmagic\nquidditch\npotion making', '', 'https://www.facebook.com/groups/uqhpa/', '')]

members = [('MegaBeth', 'robogals')]

executives = [('Leggy', 'robogals')]

def add_user(user):
	request = requests.post(ADD_USER_URL, 
		data={'username': user[0], 'password': user[1], 'name': user[2], 'email': user[3], 'studentNumber': user[4]})

	if request.status_code != 200:
		print ('Status', request.status_code, 'on adding user', username)


def add_club(club):
	request = requests.post(ADD_CLUB_URL, 
		data={'clubname': club[0], 'name': club[1], 'description': club[2], 'summary': club[3], 'logo': club[4], 'membershipPrice': club[5], 'tags': club[6], 'website': club[7], 'facebook': club[8], 'twitter': club[9]})

	if request.status_code != 200:
		print ('Status', request.status_code, 'on adding club', club[0])


def add_member(member):
	request = requests.post(ADD_MEMBER_URL.format(member[1], member[0]), data={})

	if request.status_code != 200:
		print ('Status', request.status_code, 'on adding member', username, 'to club', member[1])


def add_executive(executive):
	request = requests.post(ADD_EXECUTIVE_URL.format(executive[1], executive[0]), data={})

	if request.status_code != 200:
		print ('Status', request.status_code, 'on adding executive', username, 'to club', executive[1])


if __name__ == "__main__":
	for user in users:
		add_user(user)

	for club in clubs:
		add_club(club);

	for member in members:
		add_member(member)

	for executive in executives:
		add_executive(executive)

