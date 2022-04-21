package com.revature.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.models.User;

public class UserDAOImpl implements UserDAO {

	/*
	 * 1. Create and execute a query to get the user in a ResultSet
	 * 2. Iterate over the result set and extract values into a User object
	 * 3. Return User object
	 */
	public User getUser(String username) {
		
		try {
			// Step 1
			String query = "SELECT * FROM users WHERE username = ?";
			PreparedStatement statement = ConnectionManager.getConnection().prepareStatement(query);
			
			// Set the username filter value (ie the ?)
			statement.setString(1, username);
			
			ResultSet rs = statement.executeQuery();
			
			// Step 2
			if (rs.next()) {
				// user exists
				User user = new User();
				user.username = rs.getString("username"); // also just the username variable
				user.password = rs.getString("password");
				user.firstName = rs.getString("first_name");
				user.lastName = rs.getString("last_name");
				user.birthMonth = rs.getString("birth_month");
				return user;
				
			} else return null; // user does not exist
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	public void createUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		
	}
}
