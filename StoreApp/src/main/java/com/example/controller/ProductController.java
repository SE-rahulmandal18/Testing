package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	// add product
	@PostMapping(value="/products", produces = {MediaType.APPLICATION_JSON_VALUE},
			consumes = {MediaType.APPLICATION_JSON_VALUE})
	
	@ResponseStatus(code = HttpStatus.CREATED)
	public Product addProduct(Product product) {
		
		return productService.addProduct(product);
	}
	
	
    // update product
	@PutMapping(value="/products", produces = {MediaType.APPLICATION_JSON_VALUE},
			consumes = {MediaType.APPLICATION_JSON_VALUE})
	
	@ResponseStatus(code = HttpStatus.OK)
	public Product updateProduct(Product product) {
		
		return productService.updateProduct(product);
	}
	
	
	// delete product
	@DeleteMapping(value="/products{id}")
	@ResponseStatus(code =HttpStatus.NO_CONTENT)
	public void deleteProductById(@PathVariable("id") Integer id) {
		productService.deleteProductById(id);
	}
	
	

	// get product by id
	@GetMapping(value="/products{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Product getProductById(@PathVariable("id") Integer id) {
		
		return productService.getProductById(id);
	}
	

	//get all product
	@GetMapping(value="/products", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Product> getAllProducts(@PathVariable("id") Integer id) {
		
		return productService.getAllProducts();
	}
	

	//get product by name
	@GetMapping(value="/products/name{name}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Product> getAllProductsByName(@PathVariable("name") String name) {
		
		return productService.findByName(name);
	}
	

	//get product by brand
	@GetMapping(value="/products/name{brand}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Product> getAllProductsByBrand(@PathVariable("brand") String brand) {
		
		return productService.findByBrand(brand);
	}
	

	//get product by price
	@GetMapping(value="/products/name{price}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Product> getAllProductsByPrice(@PathVariable("price") double price) {
		
		return productService.findByPrice(price);
	}
}
