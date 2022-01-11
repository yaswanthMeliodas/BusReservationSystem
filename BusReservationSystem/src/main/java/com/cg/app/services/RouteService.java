package com.cg.app.services;

import java.util.List;

import com.cg.app.exceptions.BusNotFoundException;
import com.cg.app.model.Bus;
import com.cg.app.model.Route;


public interface RouteService {

	public Route addRoute(Route route);
	public Route updateRoute(Route route);
	public Route deleteRoute(Integer routeId)throws BusNotFoundException;
	public String viewRoute(Integer routeId);
	public List<Route> viewAllRoute();
	
}
