package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//This is the main class that will run the whole application
//The @SpringBootApplication means that this is a spring boot app and will run as such. Also, check out the pom file
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args); //Run the app
	}

}
