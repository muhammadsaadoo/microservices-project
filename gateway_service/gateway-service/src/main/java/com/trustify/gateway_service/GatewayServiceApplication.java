package com.trustify.gateway_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Arrays;

@SpringBootApplication
public class GatewayServiceApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context=SpringApplication.run(GatewayServiceApplication.class, args);

		ConfigurableEnvironment environment=context.getEnvironment();
		System.out.println(Arrays.toString(environment.getActiveProfiles()));
		System.out.println("API Gateway Service  is Running.......");


	}

}
