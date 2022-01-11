package com.cg.app.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

	public class IUser {
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Integer userId;
		private String  userName;
		private String  password;
		private String  firstName;
		private String  lastName;
		private String contact;
		private String email;
		
		@OneToMany(cascade=CascadeType.ALL,mappedBy ="user")
		private List<Reservation> reservations=new ArrayList<>();
		
		
		
}
