package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.entity.Employee;
import com.example.service.EmployeeRegistrationService;

public class EmployeeRegistrationController {

	@Autowired
     private EmployeeRegistrationService employeeRegistrationService;
	
	@PostMapping(value = "register")
	public  String orderFood(@RequestBody Employee employee) {
		
		employeeRegistrationService.sendMessage(employee);
		return "Message was send successfully";
	}
}
