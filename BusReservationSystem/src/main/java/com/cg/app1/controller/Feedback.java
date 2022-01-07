package com.cg.app1.controller;

@Getter
@Setter
public class Feedback {
	
	//@Id
		//@GeneratedValue(strategy=GenerationType.Auto)
		private Integer feedBackId;
		private Integer driverRating;
		private Integer serviceRating;
		private Integer overallRating;
		private String  comments;
		private LocalDate feedbackdate;
		private User users;
		private Bus bus;
		
}
