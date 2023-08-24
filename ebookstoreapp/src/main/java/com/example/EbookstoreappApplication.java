package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entity.BookDetails;
import com.example.repository.BookStoreRepository;

@SpringBootApplication
public class EbookstoreappApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EbookstoreappApplication.class, args);
	}
	
	@Autowired
	@Qualifier("bookStoreRepository")
	private BookStoreRepository bookStoreRepository;

	@Override
	public void run(String... args) throws Exception {
		

//		bookStoreRepository.save(new BookDetails());
//		bookStoreRepository.save(new BookDetails());
//		bookStoreRepository.save(new BookDetails());
//		bookStoreRepository.save(new BookDetails());
//		bookStoreRepository.save(new BookDetails());
//
//		System.out.println(bookStoreRepository.findAll());
		
		System.out.println("hi woorld");
		
	}

}
