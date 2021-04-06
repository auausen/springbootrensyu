package com.mycoronademo.coronawebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoronawebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronawebappApplication.class, args);
	}

}
