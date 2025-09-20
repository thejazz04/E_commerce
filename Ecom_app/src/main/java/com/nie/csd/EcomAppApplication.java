package com.nie.csd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcomAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcomAppApplication.class, args);
		System.out.println("EcomAppApplication started successfully.");
		System.out.println("Connected to MongoDB successfully.");
	}

}
