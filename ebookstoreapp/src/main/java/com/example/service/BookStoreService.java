package com.example.service;

import java.awt.print.Book;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.BookDetails;
import com.example.repository.BookStoreRepository;

@Service
public class BookStoreService {
    
    private final BookStoreRepository bookStoreRepository;

    @Autowired
    public BookStoreService(BookStoreRepository repository) {
        this.bookStoreRepository = repository;
    }
    
    public Book addBook(Book book) {
        return bookStoreRepository.save(book);
    }
    
    public Book updateBook(Book book) {
        return bookStoreRepository.save(book);
    }
    
    public List<BookDetails> getAllBooks() {
        return bookStoreRepository.findAll();
    }
    
    public List<Book> getBooksByBookId(Long bookId) {
        return bookStoreRepository.findAllByBookId(bookId);
    }
    
    public void deleteBookById(Long bookId) {
    	bookStoreRepository.deleteById(bookId);
    }
    
    public List<Book> getBooksByTitle(String title) {
        return bookStoreRepository.findByBookTitle(title);
    }
    
    public List<Book> getBooksByPublisher(String publisher) {
        return bookStoreRepository.findByBookPublisherLike(publisher);
    }
    
    public List<Book> getBooksByYear(int year) {
        return bookStoreRepository.findByYear(year);
    }
}
