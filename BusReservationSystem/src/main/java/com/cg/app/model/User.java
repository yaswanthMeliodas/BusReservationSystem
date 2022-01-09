package com.cg.app.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

	public class User {
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Integer UserId;
		private String  UserName;
		private String  Password;
		private String  FirstName;
		private String  LastName;
		private String contact;
		private String email;
		
		@OneToOne(cascade=CascadeType.ALL)
		private Reservation reservation;
		
		
		
}
