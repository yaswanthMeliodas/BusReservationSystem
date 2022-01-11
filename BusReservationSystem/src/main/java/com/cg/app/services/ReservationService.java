package com.cg.app.services;

import java.time.LocalDate;
import java.util.List;

import com.cg.app.exceptions.ReservationNotFoundException;
import com.cg.app.model.Reservation;

public interface ReservationService {
	
	public Reservation addReservation(Reservation reservation);
	public Reservation updateReservation(Reservation reservation);
	public Reservation deleteReservation(Integer reservationId)throws ReservationNotFoundException;
	public String viewReservation(Integer reservationId);
	public List<Reservation> viewAllReservation();
	public List<Reservation> getAllReservation(LocalDate date);

}
