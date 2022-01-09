package com.cg.app.services;

import java.util.List;

import com.cg.app.exceptions.UserNotFoundException;
import com.cg.app.model.User;

public interface UserService {
	
	public User addUser(User user);
	public User updateUser(User user);
	public User deleteUser(Integer userId)throws UserNotFoundException;
	public String viewUser(Integer userId);
	public List<User> viewAllUser();
	
	

}
