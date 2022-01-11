package com.cg.app.model;

import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Bus {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer busId;
	private String  busName;
	private String  driverName;
	private String busType;
	//private String  routeFrom;
	//private String routeTo;
	private LocalTime arrivalTime;
	private LocalTime departureTime;
	private Integer Seats;
	private Integer availableSeats;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Route route;
	


}
