package com.example.productservice.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.productservice.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

	public Optional<Product> finByPname(String pname);

	
}
