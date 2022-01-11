package com.cg.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.app.exceptions.BusNotFoundException;
import com.cg.app.exceptions.UserNotFoundException;
import com.cg.app.model.IUser;
import com.cg.app.model.Route;
import com.cg.app.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserServiceImplementation implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public IUser addUser(IUser user) {
	log.info("inside the addUser service method");
	IUser savedUser =userRepository.save(user);
	
	log.debug("user added  "+savedUser.getUserId());
	return savedUser;
	}

	
	@Override
	public IUser updateUser(IUser user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IUser deleteUser(Integer userId) throws UserNotFoundException {
Optional<IUser> deleteUser= userRepository.findById(userId);
		
		if(deleteUser.isPresent()) {
			
			IUser user=deleteUser.get();
			 userRepository.delete(user);
		
		return user;
		}
		else
		{
		throw new UserNotFoundException("Bus is not found with given route id");
		}
	}
	
	

	@Override
	public String viewUser(Integer userId) {
		log.info("inside the UserId service method");
		IUser userDetailsById=userRepository.findByUserId(userId);
		
		if(userDetailsById==null)
		{
			log.debug("user not found with userId "+userId);
			throw new UserNotFoundException("user not found with given Entered Id"+userId);
		}
		else
		{
		return userDetailsById.getUserName();
	}
	}
	@Override
	public List<IUser> viewAllUser() 
	{	
	return userRepository.findAll();
		}

}
