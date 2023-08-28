package com.example.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Product;
import com.example.proxy.ProductServiceProxy;

@RestController
@Scope("request")
public class ProductClientController {

	@Autowired
	private ProductServiceProxy productServiceProxy;
	
	private Logger log = LoggerFactory.getLogger(ProductClientController.class);
	
	@GetMapping("/get-products/{id}")
	public Product getProductById(@PathVariable("id") int id) {
		

		log.debug("In getProductById with Id:" + id);
		Product product =  productServiceProxy.getProductById(id);
		log.debug("In getProductById with return value Product:" + product);
		return product;
	}
	

	@GetMapping("/get-products")
	public List<Product> getAllProducts() {
		
		List<Product> products =  productServiceProxy.getAllProducts();
		log.debug("In getAllProducts with return value Products:" + products);
		
		return products;
	}
	
}
