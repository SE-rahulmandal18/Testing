package com.example.controller;
import java.awt.print.Book;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.BookDetails;
import com.example.service.BookStoreService;

@RestController
@RequestMapping("/books")
public class BookStoreRestController {

    private final BookStoreService service;

    @Autowired
    public BookStoreRestController(BookStoreService service) {
        this.service = service;
    }
    
    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return service.addBook(book);
    }
    
    @PutMapping
    public Book updateBook(@RequestBody Book book) {
        return service.updateBook(book);
    }
    
    @GetMapping
    public List<BookDetails> getAllBooks() {
        return service.getAllBooks();
    }
    
    @GetMapping("/{book_id}")
    public List<Book> getBookById(@PathVariable("book_id") Long bookId) {
        return service.getBooksByBookId(bookId);
    }
    
    @DeleteMapping("/{book_id}")
    public void deleteBookById(@PathVariable("book_id") Long bookId) {
        service.deleteBookById(bookId);
    }
    
    @GetMapping("/title/{book_title}")
    public List<Book> getBooksByTitle(@PathVariable("book_title") String title) {
        return service.getBooksByTitle(title);
    }
    
    @GetMapping("/publisher/{book_publisher}")
    public List<Book> getBooksByPublisher(@PathVariable("book_publisher") String publisher) {
        return service.getBooksByPublisher(publisher);
    }
    
    @GetMapping(params = "year")
    public List<Book> getBooksByYear(@RequestParam("year") int year) {
        return service.getBooksByYear(year);
    }
}
