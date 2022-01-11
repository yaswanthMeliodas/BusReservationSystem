package com.cg.app.services;

import java.util.List;

import com.cg.app.exceptions.UserNotFoundException;
import com.cg.app.model.IUser;

public interface UserService {
	
	public IUser addUser(IUser user);
	public IUser updateUser(IUser user);
	public IUser deleteUser(Integer userId)throws UserNotFoundException;
	public String viewUser(Integer userId);
	public List<IUser> viewAllUser();
	
	

}
