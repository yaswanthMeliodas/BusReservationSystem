package com.cg.app.services;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.app.exceptions.BusNotFoundException;
import com.cg.app.exceptions.ReservationNotFoundException;
import com.cg.app.model.Reservation;
import com.cg.app.model.Route;
import com.cg.app.repositories.ReservationRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ReservationServiceImplementation implements ReservationService{
	
	@Autowired
	private ReservationRepository reservationRepository;

	@Override
	public Reservation addReservation(Reservation reservation) {
	log.info("inside the addReservation service method");
	Reservation savedReservation =reservationRepository.save(reservation);
	
	log.debug("reservation added  "+savedReservation.getReservationId());
	return savedReservation;
	}

	
	@Override
	public Reservation updateReservation(Reservation reservation) {
	
			log.info("inside the updateReservation service method");
			Reservation savedReservation =reservationRepository.save(reservation);
			
			log.debug("reservation updated  "+savedReservation.getReservationId());
			return savedReservation;
		}

	

	@Override
	public Reservation deleteReservation(Integer reservationId) throws ReservationNotFoundException {
        Optional<Reservation> deleteReservation= reservationRepository.findById(reservationId);
		
		if(deleteReservation.isPresent()) {
			
			Reservation reservation=deleteReservation.get();
			 reservationRepository.delete(reservation);
		
		return reservation;
		}
		else
		{
		throw new ReservationNotFoundException("Bus is not found with given route id");
		}
	}
	

	@Override
	public String viewReservation(Integer reservationId) {
		log.info("inside the ReservationId service method");
		Reservation reservationDetailsById=reservationRepository.findByReservationId(reservationId);
		
		if(reservationDetailsById==null)
		{
			log.debug("reservation not found with reservationId "+reservationId);
			throw new ReservationNotFoundException("Reservation not found with given Entered Id"+reservationId);
		}
		else
		{
			return reservationDetailsById.getReservationStatus();
	}
	}
	@Override
	public List<Reservation> viewAllReservation() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Reservation> getAllReservation(LocalDate date) {
		// TODO Auto-generated method stub
		return null;
	}


}
