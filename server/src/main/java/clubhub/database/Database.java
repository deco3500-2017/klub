package clubhub.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	
	private final String url = "jdbc:sqlite:clubhub.db";
	
	private static Database INSTANCE;
	
	private Connection connection;
	
	private Database() {
		try {
			connection = DriverManager.getConnection(url);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public Connection getConnection() {
		return connection;
	}
	
	public static Database getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Database();
		}
		return INSTANCE;
	}

}
