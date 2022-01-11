package com.cg.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.app.model.Reservation;
import com.cg.app.model.IUser;
import com.cg.app.services.ReservationService;
import com.cg.app.services.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/reservation")

public class ReservationController {
	
	@Autowired
	private ReservationService reservationService;
	
	@PostMapping("/addReservation")
	public Reservation addReservationHandler(@RequestBody Reservation reservation)
	{
		log.info("inside reservationClass   ");
		return reservationService.addReservation(reservation);

}
	@GetMapping("/getReservationStatus/{reservationId}")	
	public String viewReservationHandler(@PathVariable Integer reservationId)
	{
		log.info("Get reservationStatus   ");
		return reservationService.viewReservation(reservationId);
	}
}
