package com.cg.app.model;


import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Route {
	private Integer routeId;
	private String routeFrom;
	private String routeTo;
	private Integer distance;
	
	//private List<Bus> bus;

}
