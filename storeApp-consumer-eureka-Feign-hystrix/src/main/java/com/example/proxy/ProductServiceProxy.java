package com.example.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.entity.Product;

@FeignClient(name= "product-service", fallback = ProductServiceProxy.class)
public interface ProductServiceProxy {


	@GetMapping(value = "/products", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Product> getAllProducts();
	
	@GetMapping(value = "/products/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Product getProductById(@PathVariable("id")Integer id);
}
