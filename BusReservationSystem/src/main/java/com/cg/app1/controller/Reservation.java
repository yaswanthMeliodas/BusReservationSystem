package com.cg.app1.controller;

@Getter
@Setter
public class Reservation {
	
	        //@Id
			//@GeneratedValue(strategy=GenerationType.Auto)
			private Integer reservationId;
			private String  reservationStatus;
			private String  reservationType;
			private LocalDate reservationDate;
			private LocalTime  reservationTime;
			private String source;
			private String destination;
			private Bus bus;

}
