package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.entity.Product;

@RestController
@Scope("request")
public class ProductClientController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/get-product/{id}")
	public Product getProductById(@PathVariable("id") int id) {
		
		Product product = restTemplate.getForObject(
				"htttp://product-service/produccts" +id, 
				 Product.class);
		
		return product;
	}
 
}
