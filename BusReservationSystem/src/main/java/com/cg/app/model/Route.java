package com.cg.app.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor


public class Route {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer routeId;
	private String routeFrom;
	private String routeTo;
	private Integer distance;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "route")
	//@JoinColumn(name="bs_fk",referencedColumnName ="Id")
	private List<Bus> buses=new ArrayList<>();

	
	}
	

	

