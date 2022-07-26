package com.surge.GetYourWay;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class GetYourWayApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GetYourWayApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}


}