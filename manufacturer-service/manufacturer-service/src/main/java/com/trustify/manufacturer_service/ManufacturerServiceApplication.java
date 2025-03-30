package com.trustify.manufacturer_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Arrays;

@SpringBootApplication
public class ManufacturerServiceApplication {

	public static void main(String[] args) {


		ConfigurableApplicationContext context=SpringApplication.run(ManufacturerServiceApplication.class, args);

		ConfigurableEnvironment environment=context.getEnvironment();
		System.out.println(Arrays.toString(environment.getActiveProfiles()));
		System.out.println("Manufacturer Service Running.......");
	}

}
