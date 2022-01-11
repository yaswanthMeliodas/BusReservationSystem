package com.cg.app.exceptions;

public class BusNotFoundException extends RuntimeException {
	
	public BusNotFoundException()
	{
		
	}
	
	public BusNotFoundException(String message)
	{
		super(message);
	}

}
