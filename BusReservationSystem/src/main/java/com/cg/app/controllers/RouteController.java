package com.cg.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.app.model.Bus;
import com.cg.app.model.Route;
import com.cg.app.services.RouteService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/route")

public class RouteController {
	@Autowired
	private RouteService routeService;
	
	@PostMapping("/addRoute")
	public Route addRouteHandler(@RequestBody Route route)
	{
		log.info("inside routeClass   ");
		return routeService.addRoute(route);
	}
	
@GetMapping("/getrouteFrom/{RouteId}")	
public String viewRouteHandler(@PathVariable Integer routeId)
{
	log.info("Get routeFrom  ");
	return routeService.viewRoute(routeId);
}
}



