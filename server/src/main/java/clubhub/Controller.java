package clubhub;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import clubhub.database.MembershipDAO;
import clubhub.database.UserDAO;
import clubhub.database.ClubDAO;

import clubhub.resources.Club;
import clubhub.resources.User;

@RestController
public class Controller {
	
	/*
	 * Users endpoints
	 */
	@RequestMapping(method = RequestMethod.GET, path = "/users/{username}/clubs/member")
	public List<String> userClubs(@PathVariable String username) {
		List<String> clubs = new ArrayList<String>();
		clubs.add("doglovers");
		clubs.add("robogals");
		clubs.add("uqrobotics");
		return clubs;
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/users/{username}/clubs/executive")
	public List<String> userExecutive(@PathVariable String username) {
		List<String> clubs = new ArrayList<String>();
		if (username.equals("Leggy")) {
			clubs.add("robogals");
		}
		return clubs;
	}

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
	
	/*
	 * Clubs endpoints
	 */
	
	@RequestMapping(method = RequestMethod.GET, path = "/clubs")
	public List<String> listClubs() {
		List<String> clubs = new ArrayList<String>();
		clubs.add("Dog Lovers");
		clubs.add("Robogals");
		clubs.add("UQ Robotics");
		clubs.add("Pizza Appreciation Society");
		clubs.add("Spaghetti Fan Club");
		return clubs;
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/clubs/{clubname}")
	public Club club(@PathVariable String clubname) {
		return new Club("robogals", "Robogals UQ", "Summary", new ArrayList<String>(), "images/robogals.png", 2.0f, new ArrayList<String>());
	}
	
	@RequestMapping(method = RequestMethod.POST, path = "/clubs/{clubname}/members/{username}")
	public int addMember(@PathVariable String username, @PathVariable String clubname) {
		return MembershipDAO.addMember(username, clubname);
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/clubs/{clubname}/members/{username}")
	public boolean isMember(@PathVariable String username, @PathVariable String clubname) {
		return MembershipDAO.isMember(username, clubname);
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/clubs/{clubname}/members/")
	public List<String> getMembers(@PathVariable String clubname) {
		return MembershipDAO.getMembers(clubname);
	}
	
	@RequestMapping(method = RequestMethod.POST, path = "/clubs/{clubname}/executives/{username}")
	public int addExecutive(@PathVariable String username, @PathVariable String clubname) {
		return MembershipDAO.addExecutive(username, clubname);
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/clubs/{clubname}/executives/{username}")
	public boolean isExecutive(@PathVariable String username, @PathVariable String clubname) {
		return MembershipDAO.isExecutive(username, clubname);
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/clubs/{clubname}/executives/")
	public List<String> getExecutives(@PathVariable String clubname) {
		return MembershipDAO.getExecutives(clubname);
	}

	
	
	

}
