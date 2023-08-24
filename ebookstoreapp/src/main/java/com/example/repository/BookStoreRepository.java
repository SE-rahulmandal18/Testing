package com.example.repository;

import java.awt.print.Book;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.BookDetails;

@Repository
public interface BookStoreRepository extends JpaRepository<BookDetails, Long> {
    List<Book> findAllByBookId(Long bookId);
    List<Book> findByBookTitle(String title);
    List<Book> findByBookPublisherLike(String publisher);
    List<Book> findByYear(int year);
	Book save(Book book);
}

