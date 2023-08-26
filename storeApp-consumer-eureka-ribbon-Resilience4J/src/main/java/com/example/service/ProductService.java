package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.entity.Product;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class ProductService {

	@Autowired
	private RestTemplate restTemplate;

	@CircuitBreaker(name = "product-service", fallbackMethod = "fallbackMethodForGetProductById")
	public Product getProductById(int id) {

		Product product = restTemplate.getForObject("htttp://product-service/products/" + id, Product.class);

		return product;
	}

	public Product fallbackMethodForGetProductById(int id, Throwable cause) {

		System.out.println("Exception Raised with the message:===>" + cause.getMessage());
		return new Product("IFB", 34343.0);
	}
}
