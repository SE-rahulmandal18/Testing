package com.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.example.entity.Product;
import com.example.repository.ProductRepository;

import brave.sampler.Sampler;

@EnableDiscoveryClient
@SpringBootApplication
public class StoreappApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StoreappApplication.class, args);
	}
	

	@Bean 
	public Sampler getSampler() {
		
		return Sampler.ALWAYS_SAMPLE; 
	}

	@Autowired
	@Qualifier("productRepository")
	private ProductRepository productRepository;
	
	@Override
	public void run(String... args) throws Exception {
	
		productRepository.save(new Product("LG", 45534.0));
		productRepository.save(new Product("Samung", 34534.0));
		productRepository.save(new Product("Sony", 44534.0));
		productRepository.save(new Product("Dell", 33534.0));
		productRepository.save(new Product("HP", 63534.0));

		System.out.println(productRepository.findAll());
	}

}
