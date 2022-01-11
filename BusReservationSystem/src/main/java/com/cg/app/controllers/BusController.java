package com.cg.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.app.model.Bus;
import com.cg.app.services.BusService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/bus")

public class BusController {
	@Autowired
	private BusService busService;
	
	@PostMapping("/addBusName")
	public Bus addBusHandler(@RequestBody Bus BusName)
	{
		log.info("inside busClass   ");
		return busService.addBus(BusName);
	}
	
@GetMapping("/getdriverName/{BusId}")	
public String viewUserHandler(@PathVariable Integer busId)
{
	log.info("Get driverName   ");
	return busService.viewBus(busId);
}
}



