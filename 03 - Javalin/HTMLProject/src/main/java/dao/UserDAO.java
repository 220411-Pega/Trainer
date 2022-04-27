package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.User;

public class UserDAO implements DAOInterface<User, String> {

	public void create(User element) {
		
		/* The 'Algorithm' for DAOs
		 * 
		 * 1. Create PreparedStatement
		 * 2. Set the ?s for the PreparedStatement using inputs
		 * 3. Execute query and, if relevant, get ResultSet
		 * 4. If I have one, process ResultSet
		 */
		
		Connection connection = ConnectionManager.getConnection();
		try {
			// Step 1
			PreparedStatement statement = connection.prepareStatement("INSERT INTO users VALUES (?, ?, ?, ?, ?)");
			
			// Step 2
			statement.setString(1, element.username);
			statement.setString(2, element.password);
			statement.setString(3, element.firstName);
			statement.setString(4, element.lastName);
			statement.setString(5, element.birthMonth);
			
			// Step 3
			statement.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public User get(String username) {
		
		Connection connection = ConnectionManager.getConnection();
		try {
			// Step 1
			PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE username = ?");
			
			// Step 2
			statement.setString(1, username);
			
			// Step 3
			ResultSet rs = statement.executeQuery();
			
			// Step 4
			if (rs.next()) {
				User u = new User();
				u.username = username; // rs.getString("username"); would be equivalent code here
				u.password = rs.getString("password");
				u.firstName = rs.getString("first_name");
				u.lastName = rs.getString("last_name");
				u.birthMonth = rs.getString("birth_month");
				
				return u;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	public void update(User element) {
		Connection connection = ConnectionManager.getConnection();
		
		try {
			PreparedStatement statement = connection.prepareStatement("UPDATE users "
					+ "SET password = ?, first_name = ?, last_name = ?, birth_month = ? "
					+ "WHERE username = ?");
			
			statement.setString(1, element.password);
			statement.setString(2, element.firstName);
			statement.setString(3, element.lastName);
			statement.setString(4, element.birthMonth);
			statement.setString(5, element.username);
			
			statement.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete(User element) {
		Connection connection = ConnectionManager.getConnection();
		
		try {
			PreparedStatement statement = connection.prepareStatement("DELETE FROM users WHERE username = ?");
			
			statement.setString(1, element.username);
			
			statement.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
