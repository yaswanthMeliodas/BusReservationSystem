package com.cg.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class BusReservationSystemApplication {

	public static void main(String[] args) {
		log.info("Application started..........");
		SpringApplication.run(BusReservationSystemApplication.class, args);
		log.info("Application configured..........");
	}

}
