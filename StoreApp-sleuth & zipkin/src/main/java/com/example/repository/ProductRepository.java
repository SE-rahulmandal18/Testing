package com.example.repository;

import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Product;

@Repository(value = "productRepository")
@Scope("singleton")
public interface ProductRepository extends JpaRepository<Product, Integer> {

}