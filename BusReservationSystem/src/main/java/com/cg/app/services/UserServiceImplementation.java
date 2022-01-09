package com.cg.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.app.exceptions.UserNotFoundException;
import com.cg.app.model.User;
import com.cg.app.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserServiceImplementation implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User addUser(User user) {
	log.info("inside the addUser service method");
	User savedUser =userRepository.save(user);
	
	log.debug("user added  "+savedUser.getUserId());
	return savedUser;
	}

	
	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User deleteUser(Integer userId) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String viewUser(Integer userId) {
		log.info("inside the UserId service method");
		User userDetailsById=userRepository.findByUserId(userId);
		
		if(userDetailsById==null)
		{
			log.debug("user not found with userId "+userId);
			throw new UserNotFoundException("user not found with given Entered Id"+userId);
		}
		else
		{
		return userDetailsById.getReservation().getUserName();
	}
	}
	@Override
	public List<User> viewAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
