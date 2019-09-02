package com.deepak.rentACar.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.deepak.rentACar.model.Car;

@RestController
public class SearchCarController {
	
	private static final Logger logger = LogManager.getLogger(SearchCarController.class);

	
	@GetMapping(value="/rentACar/search/{city}")
	public List<Car> searchCarsInACity(@PathVariable String city){
		logger.info("Searching available cars for city:"+city);
		return null;
		
	}

}
