package com.cg.app.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.apache.catalina.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Feedback {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
		private Integer feedBackId;
		private Integer driverRating;
		private Integer serviceRating;
		private Integer overallRating;
		private String  comments;
		private LocalDate feedbackdate;
		private User users;
		private Bus bus;
		
}
