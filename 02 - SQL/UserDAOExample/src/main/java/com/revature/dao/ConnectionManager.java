package com.revature.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	private static Connection connection;
	
	private static String connectionString = "jdbc:postgresql://castor.db.elephantsql.com:5432/lfzclwhe",
			username = "lfzclwhe",
			password = "A1UNq_NkFNNbw9QlHNGDa-NiPeBGN1Zm";
	
	public static Connection getConnection() {
		try {
			if (connection == null || connection.isClosed()) {
			
				Class.forName("org.postgresql.Driver");
				connection = DriverManager.getConnection(connectionString, username, password);
			}
			
			return connection;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}