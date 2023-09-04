package com.example.producer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;

@Service
public class EmployeeRegistrationProducer {
	
	@RabbitListener(queues = {"${rabbitmq.queue.name}"})
	public void consume(Employee employee) {
	
		System.out.println("Message arrived! Message: " + employee );
	}
}
