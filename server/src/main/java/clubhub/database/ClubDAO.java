package clubhub.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import clubhub.resources.Club;

public class ClubDAO {

	//String clubname, String name, List<String> description, String summary, String logo,
	//int membershipPrice, List<String> tags

	private static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS clubs (\n"
			+ "	clubname text PRIMARY KEY, name text NOT NULL, description text NOT NULL, summary text NOT NULL,\n"
			+ "	logo text NOT NULL, membershipPrice int NOT NULL, tags text NOT NULL);";

	private static final String GET_CLUB = "SELECT * FROM clubs WHERE clubname = ?;";
	
	private static final String GET_CLUBS = "SELECT clubname, name FROM clubs";

	private static final String ADD_CLUB = "INSERT INTO clubs(clubname, name, description, summary, logo, membershipPrice, tags) \n"
			+ "VALUES(?, ?, ?, ?, ?, ?, ?);";
	
	private static final String UPDATE_CLUB = "UPDATE users set name=?, description=?, summary=?, logo=?, membershipPrice=?, tags=? \n"
			+ "WHERE clubname=?;";

	public static Club getClub(String clubname) {
		verifyTable();
		Club result = null;
		try {
			PreparedStatement statement = Database.getInstance().getConnection().prepareStatement(GET_CLUB);
			statement.setString(1, clubname);
			ResultSet set = statement.executeQuery();
			if (!set.isBeforeFirst()) {
				set.close();
				return null;
			}
			List<String> description = Arrays.asList(set.getString(3).split("\n"));
			List<String> tags = Arrays.asList(set.getString(7).split("\n"));

			result = new Club(set.getString(1), set.getString(2), description, set.getString(4), set.getString(5),
					set.getInt(6), tags);
			set.close();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static Club addClub(String clubname, String name, String description, String summary, String logo,
			String membership, String tags) {
		verifyTable();
		int membershipPrice = Integer.parseInt(membership);
		
		if (getClub(clubname) != null) {
			return updateClub(clubname, name, description, summary, logo, membershipPrice, tags);
		}

		try {
			PreparedStatement statement = Database.getInstance().getConnection().prepareStatement(ADD_CLUB);
			statement.setString(1, clubname);
			statement.setString(2, name);
			statement.setString(3, description);
			statement.setString(4, summary);
			statement.setString(5, logo);
			statement.setInt(6, membershipPrice);
			statement.setString(7, tags);
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return getClub(clubname);

	}
	
	public static Map<String, String> getClubs() {
		verifyTable();
		Map<String, String> result = new HashMap<String, String>();
		try {
			PreparedStatement statement = Database.getInstance().getConnection().prepareStatement(GET_CLUBS);
			ResultSet set = statement.executeQuery();

			if (set.isBeforeFirst()) {
				while(set.next()) {
					result.put(set.getString(1), set.getString(2));
				}
			}
			set.close();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public static Club updateClub(String clubname, String name, String summary, String description, String logo,
			int membershipPrice, String tags) {
		verifyTable();
		try {
			PreparedStatement statement = Database.getInstance().getConnection().prepareStatement(UPDATE_CLUB);
			statement.setString(1, name);
			statement.setString(2, description);
			statement.setString(3, summary);
			statement.setString(4, logo);
			statement.setInt(5, membershipPrice);
			statement.setString(6, tags);
			statement.setString(7, clubname);
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return getClub(clubname);

	}

	private static void verifyTable() {
		Connection connection = Database.getInstance().getConnection();
		try {
			connection.createStatement().executeUpdate(CREATE_TABLE);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static List<String> getUsersClubs(String username) {
		// TODO Auto-generated method stub
		List<String> clubs = new ArrayList<String>();
		clubs.add("doglovers");
		clubs.add("robogals");
		clubs.add("uqrobotics");
		return clubs;
	}

	public static List<String> getUsersClubsExecutive(String username) {
		// TODO Auto-generated method stub
		List<String> clubs = new ArrayList<String>();
		if (username.equals("Leggy")) {
			clubs.add("robogals");
		}
		return clubs;
	}


}
