package com.trustify.product_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Arrays;

@SpringBootApplication
public class ProductServiceApplication {

	public static void main(String[] args) {


		ConfigurableApplicationContext context=SpringApplication.run(ProductServiceApplication.class, args);

		ConfigurableEnvironment environment=context.getEnvironment();
		System.out.println(Arrays.toString(environment.getActiveProfiles()));
		System.out.println("Product Service Running.......");
	}

}
