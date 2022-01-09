package com.cg.app.exceptions;

public class UserNotFoundException extends RuntimeException {
	
	public UserNotFoundException()
	{
		
	}
	
	public UserNotFoundException(String message)
	{
		super(message);
	}

}
