package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Product;
import com.example.service.ProductService;

@RestController
@Scope("request")
public class ProductClientController {

	@Autowired
	private ProductService productService;
 	
	private Logger log = LoggerFactory.getLogger(ProductClientController.class);
	
	@GetMapping("/get-products/{id}")
 	public Product getProductById(@PathVariable int id) {
		
		log.debug("In getProductById with Id:" + id);
		Product product =  productService.getProductById(id);
		log.debug("In getProductById with return value Product:" + product);
		return product;
	}
}
