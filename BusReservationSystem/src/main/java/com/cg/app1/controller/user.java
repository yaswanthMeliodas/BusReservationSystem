package com.cg.app1.controller;


	@Getter
	@Setter
	public class user {
		
		//@Id
		//@GeneratedValue(strategy=GenerationType.Auto)
		private Integer UserLoginId;
		private String  UserName;
		private String  Password;
		private String  FirstName;
		private String  LastName;
		private long contact;
		private String email;
		private Reservation reservation;
		
		
		
}
