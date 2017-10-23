import requests

ADD_USER_URL = "http://localhost:8080/users/"
ADD_MEMBER_URL = "http://localhost:8080/clubs/{}/members/{}"
ADD_EXECUTIVE_URL = "http://localhost:8080/clubs/{}/executives/{}"


users = [('MegaBeth', 'ilovecats', 'Beth Cave', 'beth@clubcub.com', 's1234567'), 
		('Leggy', 'iloveducks', 'Lachlan Healey', 'leggy@cluhub.com', 's1234555'),
		('krista', '<3cats', 'Krista Harrison', 'someemail', 's1231232')]

members = [('MegaBeth', 'cats')]

executives = [('krista', 'cats')]

def add_user(user):
	request = requests.post(ADD_USER_URL, 
		data={'username': user[0], 'password': user[1], 'name': user[2], 'email': user[3], 'studentNumber': user[4]})

	if request.status_code != 200:
		print ('Status', request.status_code, 'on adding user', username)


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

	for member in members:
		add_member(member)

	for executive in executives:
		add_executive(executive)

