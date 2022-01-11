package com.cg.app.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.cg.app.model.Reservation;

@Repository
public interface ReservationRepository extends JpaRepositoryImplementation<Reservation, Integer> {

	public Reservation findByReservationId(Integer reservationId);
}
