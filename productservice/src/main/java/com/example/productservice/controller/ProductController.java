package com.example.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.productservice.model.Product;
import com.example.productservice.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService ps;
	
	@GetMapping("/products")
	public List<Product> findAll(){
		return ps.findall();
	}
	
	@GetMapping("/product/{name}")
	public ResponseEntity<Product> findByName(@PathVariable String name){
		return new ResponseEntity<Product>(ps.findByName(name), HttpStatus.OK);
	}
	
	
	
}
