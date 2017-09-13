package clubhub;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import clubhub.database.UserDAO;
import clubhub.resources.User;

@RestController
public class Controller {

	@RequestMapping(method = RequestMethod.GET, path = "/users/{username}")
	public User user(@PathVariable String username) {
		return UserDAO.getUser(username);
	}

	@RequestMapping(method = RequestMethod.POST, path = "/users")
	public User addUser(@RequestParam(value = "username", required = true) String username,
			@RequestParam(value = "password", required = true) String password, 
			@RequestParam(value="name", required=true) String name, 
			@RequestParam(value="email", required=true) String email, 
			@RequestParam(value="studentNumber", required=true) String studentNumber) {
		return UserDAO.addUser(username, password, name, email, studentNumber);
	}

	@RequestMapping(method = RequestMethod.GET, path = "/olduser")
	public User user2(@RequestParam(value = "username", required = true) String username) {
		return UserDAO.getUser(username);
	}

}
