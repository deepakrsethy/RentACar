package com.deepak.rentACar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RentACarApplication {

	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/rentACar");
		SpringApplication.run(RentACarApplication.class, args);
	}

}
