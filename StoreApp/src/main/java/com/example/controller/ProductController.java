package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Product;
import com.example.service.IProductService;

@RestController
@Scope(value = "request")
public class ProductController {

	@Autowired
	@Qualifier("productService")
	private IProductService productService;
	
	@PostMapping(value="/product", produces = {MediaType.APPLICATION_JSON_VALUE},
			consumes = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseStatus(code = HttpStatus.CREATED)
	public Product addProduct(Product product) {
		
		return productService.addProduct(product);
	}
}
