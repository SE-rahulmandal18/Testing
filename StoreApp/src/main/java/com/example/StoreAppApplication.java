package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.entity.Product;
import com.example.repository.ProductRepository;

@ComponentScan({"com.example.controller","com.example.entity", "com.example.repository","com.example.service"})
@EnableJpaRepositories
@SpringBootApplication
public class StoreAppApplication implements CommandLineRunner{

	@Autowired
	@Qualifier("productRepository")
	private ProductRepository productRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(StoreAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		productRepository.save(new Product(null, "TV", "LG", 743243.0));

		productRepository.save(new Product(null, "Monitor", "Dell", 24500.0));

		productRepository.save(new Product(null, "EarBuda2", "Samsung", 44243.0));

		productRepository.save(new Product(null, "MobilePhone", "onePlus11R", 55243.0));
	}

}
