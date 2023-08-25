package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.entity.Product;

@Service
public class ProductService {


	@Autowired
	private RestTemplate restTemplate;

	public Product getProductById(int id) {

		Product product = restTemplate.getForObject("htttp://product-service/products/" + id, Product.class);

		return product;
	}
}
