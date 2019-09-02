package com.deepak.rentACar.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	private static final Logger logger = LogManager.getLogger(WelcomeController.class);

	@GetMapping(value="/")
	public String welcome(){
		logger.info("Welcome controller called and welcome page is attempted");	
		logger.debug("Welcome controller called and welcome page is attempted");
		return "Welcome to Rent A Car";
	}
}
