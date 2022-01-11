package com.cg.app.services;

import java.util.List;

import com.cg.app.exceptions.BusNotFoundException;
import com.cg.app.model.Bus;
import com.cg.app.model.Route;


public interface BusService {

	public Bus addBus(Bus busName);
	public Bus updateBus(Bus bus);
	public Bus deleteBus(Integer busId)throws BusNotFoundException;
	public String viewBus(Integer busId);
	public List<Bus> viewAllBus();
	
}