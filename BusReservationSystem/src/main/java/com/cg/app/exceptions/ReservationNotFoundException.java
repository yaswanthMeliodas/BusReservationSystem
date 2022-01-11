package com.cg.app.exceptions;

public class ReservationNotFoundException extends RuntimeException {
	public ReservationNotFoundException()
	{
		
	}
	
	public ReservationNotFoundException(String message)
	{
		super(message);
	}

}
