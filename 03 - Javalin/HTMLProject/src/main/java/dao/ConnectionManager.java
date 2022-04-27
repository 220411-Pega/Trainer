package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {

	private static String connectionURL = "jdbc:postgresql://castor.db.elephantsql.com:5432/lfzclwhe",
		username = "lfzclwhe",
		password = "A1UNq_NkFNNbw9QlHNGDa-NiPeBGN1Zm";
	
	private static Connection connection;
	
	public static Connection getConnection() {
		
		try {
			if (connection == null || connection.isClosed()) {
				Class.forName("org.postgresql.Driver");
				connection = DriverManager.getConnection(connectionURL, username, password);
			}
			
			return connection;
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
}
