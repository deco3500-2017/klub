package clubhub.resources;

public class User {
	
	private String username;
	private String password;
	private String name;
	private String email;
	private String studentNumber;
	
	/**
	 * 
	 * @param username
	 * @param password
	 * @param name
	 * @param email
	 * @param studentNumber
	 */
	public User(String username, String password, String name, String email, String studentNumber) {
		this.username  = username;
		this.password = password;
		this.name = name;
		this.email = email;
		this.studentNumber = studentNumber;
	}
	
	public User(String username, String name, String email, String studentNumber) {
		this.username  = username;
		this.password = "None of your business.";
		this.name = name;
		this.email = email;
		this.studentNumber = studentNumber;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the studentNumber
	 */
	public String getStudentNumber() {
		return studentNumber;
	}

}
