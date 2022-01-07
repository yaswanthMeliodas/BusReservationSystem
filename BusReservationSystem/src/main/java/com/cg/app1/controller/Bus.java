package com.cg.app1.controller;

@Getter
@Setter
public class Bus {
	
	//@Id
	//@GeneratedValue(strategy=GenerationType.Auto)
	private Integer busId;
	private String  busName;
	private String  driverName;
	private String busType;
	private String  routeFrom;
	private String routeTo;
	private LocalTime arrivalTime;
	private LocalTime departureTime;
	private Integer Seats;
	private Integer availableSeats;
	

}
