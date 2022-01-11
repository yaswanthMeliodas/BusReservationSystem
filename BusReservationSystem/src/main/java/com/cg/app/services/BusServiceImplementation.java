package com.cg.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.app.exceptions.BusNotFoundException;
import com.cg.app.exceptions.RouteNotFoundException;
import com.cg.app.model.Bus;
import com.cg.app.model.Route;
import com.cg.app.model.IUser;
import com.cg.app.model.Reservation;
import com.cg.app.repositories.BusRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BusServiceImplementation implements BusService{

	@Autowired
	private BusRepository busRepository;
	
	@Override
	public Bus addBus(Bus busName) {
		log.info("inside the addUser service method");
		Bus savedBus=busRepository.save(busName);
		
		log.debug("bus added  "+savedBus.getBusId());
		return addBus(busName);
	}

	@Override
	public Bus updateBus(Bus bus) {
		log.info("inside the updateReservation service method");
		Bus savedBus =busRepository.save(bus);
		
		log.debug("Bus updated  "+savedBus.getBusId());
		return savedBus;
	}

	@Override
	public Bus deleteBus(Integer busId) throws BusNotFoundException {
Optional<Bus> deleteBus= busRepository.findById(busId);
		
		if(deleteBus.isPresent()) {
			
			Bus bus=deleteBus.get();
			 busRepository.delete(bus);
		
		return bus;
		}
		else
		{
		throw new BusNotFoundException("Bus is not found with given route id");
		}
	}
	

	@Override
	public String viewBus(Integer busId) {
			log.info(" root is viewed as per route Id..............");
			Bus viewBus=busRepository.findById(busId).get();
			
		
				if(viewBus==null)
				{
					log.debug("user not found with userId "+busId);
					throw new BusNotFoundException("Bus not found with given Entered Id"+busId);
				}
				else
				{
				return viewBus.getBusName();
			}
	}

	@Override
	public List<Bus> viewAllBus() {
		return busRepository.findAll();
	}

}
