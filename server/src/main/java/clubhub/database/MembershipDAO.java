package clubhub.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import clubhub.resources.User;

public class MembershipDAO {

	private static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS membership (\n"
			+ "	username text NOT NULL, clubname text NOT NULL, status integer NOT NULL,\n"
			+ "	PRIMARY KEY(username, clubname),\n"
			+ " FOREIGN KEY (username) REFERENCES users(username) ON DELETE CASCADE ON UPDATE NO ACTION);";

	private static final String GET_STATUS = "SELECT status FROM membership\n"
			+ " WHERE username = ? AND clubname = ?;";

	private static final String ADD_USER = "INSERT INTO membership(username, clubname, status) \n" + "VALUES(?, ?, ?);";

	private static final String UPDATE_USER = "UPDATE membership set status = ?\n"
			+ " WHERE username = ? AND clubname = ?;";

	public static List<User> getMembers(String clubname) {
		return null;
	}

	public static List<User> getExecutives(String clubname) {
		return null;
	}

	public static boolean isMember(String username, String clubname) {
		int status = getStatus(username, clubname);
		return status == 0 || status == 1;
	}

	public static boolean isExecutive(String username, String clubname) {
		int res = getStatus(username, clubname);
		System.out.println(username + " + " + clubname + ": " + res);
		return res == 1;
	}

	/**
	 * Returns the status of the membership in the club. 0 if the user is a member,
	 * 1 if the user is an executive, and -1 otherwise.
	 * 
	 * @param username
	 *            The username of the user.
	 * @param clubname
	 *            The clubname of the club, to check that the member is in.
	 * @return Returns the status of the member, as above.
	 */
	private static int getStatus(String username, String clubname) {
		verifyTable();
		try {
			PreparedStatement statement = Database.getInstance().getConnection().prepareStatement(GET_STATUS);
			statement.setString(1, username);
			statement.setString(2, clubname);
			ResultSet set = statement.executeQuery();

			if (!set.isBeforeFirst()) {
				set.close();
				return -1;
			}
			int result = set.getInt(1);
			System.out.println("result = " + result);
			System.out.println("username: " + username);
			System.out.println("clubname: " + clubname);

			set.close();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

	/**
	 * Adds a member to a club.
	 * 
	 * @param username
	 *            The username of the user to add.
	 * @param clubname
	 *            The clubname of the club to add the user to.
	 * @return Returns the new status of the member, which ought to be 0 unless
	 *         there was an error.
	 */
	public static int addMember(String username, String clubname) {
		return setStatus(username, clubname, 0);
	}

	/**
	 * Elevates a member of a club to executive status. The member need not already
	 * be a member of the club
	 * 
	 * @param username
	 *            The username of the executive to add.
	 * @param clubname
	 *            The clubname of the club to add the executive.
	 * @return Returns the new status of the executive, which ought to be 1 unless
	 *         there was an error.
	 */
	public static int addExecutive(String username, String clubname) {
		return setStatus(username, clubname, 1);
	}

	private static int setStatus(String username, String clubname, int status) {
		verifyTable();
		int currentStatus = getStatus(username, clubname);
		if (currentStatus == status) {
			return status;
		}

		try {
			if (currentStatus == -1) {
				PreparedStatement statement = Database.getInstance().getConnection().prepareStatement(ADD_USER);
				statement.setString(1, username);
				statement.setString(2, clubname);
				statement.setInt(3, status);
				statement.execute();
			} else {
				PreparedStatement statement = Database.getInstance().getConnection().prepareStatement(UPDATE_USER);
				statement.setInt(1, status);
				statement.setString(2, username);
				statement.setString(3, clubname);
				statement.execute();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return getStatus(username, clubname);
	}

	/**
	 * Removes a member from a club, completely.
	 * 
	 * @param username
	 *            The username of the user to remove from the club.
	 * @param clubname
	 *            The club to remove the user from.
	 * @return Returns the new status of the member, which ought to be -1 unless
	 *         there was an error.
	 */
	public static int removeMember(String username, String clubname) {
		return 0;
	}

	/**
	 * Removes a member from executive status, returning them to member status.
	 * 
	 * @param username
	 *            The username of the user to remove as an executive.
	 * @param clubname
	 *            The club to remove the executive from.
	 * @return Returns the new status of the member, which ought to be 0 unless
	 *         there was an error.
	 */
	public static int removeExecutive(String username, String clubname) {
		return 0;
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
