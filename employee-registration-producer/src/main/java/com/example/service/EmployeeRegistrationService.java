package com.example.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.example.entity.Employee;

public class EmployeeRegistrationService {

	@Value("${rabbitmq.exchange.name}")
	private String exchange;
	
	@Value("${rabbitmq.routing.key}")
	private String routingKey;
	
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	public void sendMessage(Employee employee) {
		
		rabbitTemplate.convertAndSend(exchange, routingKey, employee);
	}
}
