package com.trustify.auth_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Arrays;

@SpringBootApplication
public class AuthServiceApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context=SpringApplication.run(AuthServiceApplication.class, args);

		ConfigurableEnvironment environment=context.getEnvironment();
		System.out.println(Arrays.toString(environment.getActiveProfiles()));
		System.out.println("Auth Service Running.......");
	}

}
