package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {
	    "com.example.controller",
	    "com.example.producer"
	})
@SpringBootApplication
public class EmployeeRegistrationProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeRegistrationProducerApplication.class, args);
	}

}
