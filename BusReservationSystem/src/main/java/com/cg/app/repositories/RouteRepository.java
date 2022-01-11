package com.cg.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.app.model.Bus;
import com.cg.app.model.Route;
import com.cg.app.model.IUser;

@Repository
public interface RouteRepository extends JpaRepository<Route,Integer> {

	
	}

	//public Route findByRouteId(Integer routeId);

	//public Route save(Route route);


