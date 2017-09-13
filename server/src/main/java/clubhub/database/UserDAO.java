package clubhub.database;

import java.sql.Connection;
import java.sql.SQLException;

import clubhub.resources.User;

public class UserDAO {
	
	private static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS users (\n"
            + "	username text PRIMARY KEY,\n"
            + "	password text NOT NULL,\n"
            + "	name text NOT NULL,\n"
            + "	email text NOT NULL,\n"
            + "	studentNumber text NOT NULL\n"
            + ");";
	
	public static User getUser(String username) {
		verifyTable();
		
		return new User(username, "ilovecats", "Beth", "beth@clubhub.com", "12345678");
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
