package com.cg.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.app.model.IUser;
import com.cg.app.services.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/iuser")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/addUser")
	public IUser addUserHandler(@Validated @RequestBody IUser user)
	{
		log.info("inside userClass   ");
		return userService.addUser(user);
	}
	
@GetMapping("/getUserName/{userId}")	
public String viewUserHandler( @PathVariable Integer userId)
{
	log.info("Get userName   ");
	return userService.viewUser(userId);
}
}
