package com.cg.app1.controller;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;



@Entity
@Getter
@Setter
public class Admin {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer adminId;
	private String  adminUserName;
	private String  adminPassword;
	
	
	
	
	

}
