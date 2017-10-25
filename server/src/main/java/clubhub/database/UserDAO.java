package clubhub.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import clubhub.resources.User;

public class UserDAO {
	
	private static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS users (\n"
            + "	username text PRIMARY KEY, password text NOT NULL, name text NOT NULL,\n"
            + "	email text NOT NULL, studentNumber text NOT NULL);";
	
	private static final String GET_USER = "SELECT * FROM users WHERE username = ?;";
	
	private static final String ADD_USER = "INSERT INTO users(username, password, name, email, studentNumber) \n"
			+ "VALUES(?, ?, ?, ?, ?);";
	
	private static final String UPDATE_USER = "UPDATE users set password=?, name=?, email=?, studentNumber=? \n"
			+ "WHERE username=?;";
	
	public static User getUser(String username) {
		verifyTable();
		try {
			PreparedStatement statement = Database.getInstance().getConnection().prepareStatement(GET_USER);
			statement.setString(1, username);
			ResultSet set = statement.executeQuery();
			if(!(set.isBeforeFirst())) {
				set.close();
				return null;
			}
			User result = new User(set.getString(1), set.getString(2), set.getString(3), set.getString(4), set.getString(5));
			set.close();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static User addUser(String username, String password, String name, String email, String studentNumber) {
		verifyTable();
		if(getUser(username) != null) {
			return updateUser(username, password, name, email, studentNumber);
		}
		
		try {
			PreparedStatement statement = Database.getInstance().getConnection().prepareStatement(ADD_USER);
			statement.setString(1, username);
			statement.setString(2, password);
			statement.setString(3, name);
			statement.setString(4, email);
			statement.setString(5, studentNumber);
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return getUser(username);
		
	}
	
	public static User updateUser(String username, String password, String name, String email, String studentNumber) {
		verifyTable();
		try {
			PreparedStatement statement = Database.getInstance().getConnection().prepareStatement(UPDATE_USER);
			statement.setString(1, password);
			statement.setString(2, name);
			statement.setString(3, email);
			statement.setString(4, studentNumber);
			statement.setString(5, username);
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return getUser(username);
		
	}
	
	private static void verifyTable() {
		Connection connection = Database.getInstance().getConnection();
		try {
			connection.createStatement().executeUpdate(CREATE_TABLE);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
