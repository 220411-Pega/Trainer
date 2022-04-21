package com.revature.dao;

import com.revature.models.User;

public interface UserDAO {

	public User getUser(String username);
	
	public void createUser(User user);
	
	public void updateUser(User user);
	
	public void deleteUser(User user);
}
