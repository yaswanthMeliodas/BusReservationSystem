package com.cg.app.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
	
	        @Id
			@GeneratedValue(strategy=GenerationType.AUTO)
			private Integer reservationId;
			private String  reservationStatus;
			private String  reservationType;
			private LocalDate reservationDate;
			private LocalTime  reservationTime;
			private String source;
			private String destination;
			private Bus bus;
			public String getUserName() {
				// TODO Auto-generated method stub
				return null;
			}

}
