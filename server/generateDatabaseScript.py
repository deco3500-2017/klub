import requests

ADD_USER_URL = "http://localhost:8080/users/"
ADD_CLUB_URL = "http://localhost:8080/clubs/"
ADD_MEMBER_URL = "http://localhost:8080/clubs/{}/members/{}"
ADD_EXECUTIVE_URL = "http://localhost:8080/clubs/{}/executives/{}"


users = [('MegaBeth', 'ilovecats', 'Beth Cave', 'beth@clubcub.com', 's1234567'), 
		('Leggy', 'iloveducks', 'Lachlan Healey', 'leggy@cluhub.com', 's1234555'),
		('krista', '<3cats', 'Krista Harrison', 'someemail', 's1231232')]

clubs = [('robogals', 'Robogals UQ', 'Description!!!\nLine 2', 'Short summary here', 'robogals.png', 2, 'volunteering\ndiversity')]

members = [('MegaBeth', 'robogals')]

executives = [('Leggy', 'robogals')]

def add_user(user):
	request = requests.post(ADD_USER_URL, 
		data={'username': user[0], 'password': user[1], 'name': user[2], 'email': user[3], 'studentNumber': user[4]})

	if request.status_code != 200:
		print ('Status', request.status_code, 'on adding user', username)


def add_club(club):
	request = requests.post(ADD_CLUB_URL, 
		data={'clubname': club[0], 'name': club[1], 'description': club[2], 'summary': club[3], 'logo': club[4], 'membershipPrice': club[5], 'tags': club[6]})

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

