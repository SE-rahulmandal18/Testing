package com.example.proxy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.entity.Product;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@FeignClient(name= "product-service")
public interface ProductServiceProxy {

    @CircuitBreaker(name= "product-service", fallbackMethod = "fallbackMethodGetAllProducts")
	@GetMapping(value = "/products", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Product> getAllProducts();
	
    @CircuitBreaker(name= "product-service", fallbackMethod = "fallbackMethodGetProductById")
	@GetMapping(value = "/products/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Product getProductById(@PathVariable("id")Integer id);


	
	public default Product fallbackMethodGetProductById(Integer id, Throwable cause) {
		System.out.println("Exception raised with message:===> " + cause.getMessage());
		return new Product("IFB", 34343.0);
		
	}


	public default List<Product> fallbackMethodGetAllProducts(Throwable cause) {
		System.out.println("Exception raised with message:===> " + cause.getMessage());
		return new ArrayList<Product>();
		
	}

}
