package clubhub;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
	
	@RequestMapping(method = RequestMethod.GET, path = "/search/{searchString}")
	public List<Club> search(@PathVariable String searchString) {
		String[] searchParameters = searchString.split(" ");
		List<Club> resultClubs = new ArrayList<Club>();
		List<Club> allClubs = ClubDAO.getAllClubs();
		
		for(Club club : allClubs) {
			for(String searchParam : searchParameters) {
				
				if(club.getTags().contains(searchParam)) {
					resultClubs.add(club);
					continue;
				} else if (club.getDescription().toString().contains(searchParam)) {
					resultClubs.add(club);
					continue;
				} else if (club.getSummary().contains(searchParam)){
					resultClubs.add(club);
					continue;
				} else if(club.getClubname().contains(searchParam) || club.getName().contains(searchParam)) {
					resultClubs.add(club);
					continue;
				}
			}
		}
		return resultClubs;
	}
	
	/*
	 * Users endpoints
	 */
	@RequestMapping(method = RequestMethod.GET, path = "/users/{username}/clubs/member")
	public List<String> userClubs(@PathVariable String username) {
		return MembershipDAO.getUsersClubs(username);
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/users/{username}/clubs/executive")
	public List<String> userExecutive(@PathVariable String username) {
		return MembershipDAO.getUsersClubsExecutive(username);
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
	
	@RequestMapping(method = RequestMethod.POST, path = "/clubs")
	public Club addClub(@RequestParam(value = "clubname", required = true) String clubname,
			@RequestParam(value = "name", required = true) String name,
			@RequestParam(value = "description", required = true) String description, 
			@RequestParam(value = "summary", required = true) String summary, 
			@RequestParam(value = "logo", required = true) String logo, 
			@RequestParam(value = "membershipPrice", required = true) String membershipPrice, 
			@RequestParam(value = "tags", required = true) String tags,
			@RequestParam(value = "website", required = true) String website,
			@RequestParam(value = "facebook", required = true) String facebook,
			@RequestParam(value = "twitter", required = true) String twitter) {
		System.out.println("Adding club: " + clubname);
		System.out.println("Summary: " + summary);
		return ClubDAO.addClub(clubname, name, description, summary, logo, membershipPrice, tags, website, facebook, twitter);
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/clubs")
	public Map<String, String> listClubs() {
		return ClubDAO.getClubs();
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/clubs/all")
	public List<Club> allClubs() {
		List<Club> allClubs = ClubDAO.getAllClubs();
		return allClubs;
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/clubs/{clubname}")
	public Club club(@PathVariable String clubname) {
		return ClubDAO.getClub(clubname);
	}	
	
	/*
	 * Club Membership
	 */
	
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
