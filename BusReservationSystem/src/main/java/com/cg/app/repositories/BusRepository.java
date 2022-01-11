package com.cg.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.cg.app.model.Bus;
import com.cg.app.model.Reservation;
import com.cg.app.model.Route;


public interface BusRepository extends JpaRepository<Bus,Integer> {
	
	

	//public Bus findByBusId(Integer busId);
	
	

}
