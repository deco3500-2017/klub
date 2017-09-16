import requests

ADD_USER_URL = "http://localhost:8080/users/"

users = [('MegaBeth', 'ilovecats', 'Beth Cave', 'beth@clubcub.com', 's1234567'), 
		('Leggy', 'iloveducks', 'Lachlan Healey', 'leggy@cluhub.com', 's1234555'),
		('krista', '<3cats', 'Krista Harrison', 'someemail', 's1231232')]

def add_user(user):
	request = requests.post(ADD_USER_URL, 
		data={'username': user[0], 'password': user[1], 'name': user[2], 'email': user[3], 'studentNumber': user[4]})

	if request.status_code != 200:
		print 'Status', request.status_code, 'on adding user', username



if __name__ == "__main__":
	for user in users:
		add_user(user)

