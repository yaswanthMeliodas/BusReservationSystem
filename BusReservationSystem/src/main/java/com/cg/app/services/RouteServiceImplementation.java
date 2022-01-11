package com.cg.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.app.exceptions.BusNotFoundException;
import com.cg.app.exceptions.RouteNotFoundException;
import com.cg.app.exceptions.UserNotFoundException;
import com.cg.app.model.Bus;
import com.cg.app.model.Route;
import com.cg.app.model.IUser;
import com.cg.app.repositories.RouteRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class RouteServiceImplementation implements RouteService {

	@Autowired
	private RouteRepository routeRepository;
	
	@Override
	public Route addRoute(Route route) {
		 
			log.info("inside the addRoute service method");
			Route savedRoute =routeRepository.save(route);
			
			log.debug("user added  "+savedRoute.getRouteId());
			return savedRoute;

	}

	@Override
	public Route updateRoute(Route route) {
		log.info("inside the updateRoute service method");
		Route savedRoute =routeRepository.save(route);
		
		log.debug("user updated  "+savedRoute.getRouteId());
		return savedRoute;
	}

	

	@Override
	public Route deleteRoute(Integer routeId) throws BusNotFoundException {
		Optional<Route> deleteRoute= routeRepository.findById(routeId);
		
		if(deleteRoute.isPresent()) {
			
			Route route=deleteRoute.get();
			 routeRepository.delete(route);
		
		return route;
		}
		else
		{
		throw new BusNotFoundException("Bus is not found with given route id");
		}
	}
	

	@Override
	public String viewRoute(Integer routeId) {
		log.info(" root is viewed as per route Id..............");
		Route viewRoute=routeRepository.findById(routeId).get();
		
	
			if(viewRoute==null)
			{
				log.debug("user not found with userId "+routeId);
				throw new RouteNotFoundException("root not found with given Entered Id"+routeId);
			}
			else
			{
			return viewRoute.getRouteTo();
		}
		}
	

	@Override
	public List<Route> viewAllRoute() {
		
		return routeRepository.findAll();
		
	}

}
