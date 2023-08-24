package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Book_Details")
public class BookDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String book_title;
	private String book_publisher;
	private String book_isbn;
	private int book_number_of_pages;
	private int book_yearWhere;

	// Default constructor
	public BookDetails() {
	}

	public BookDetails(Long id, String book_title, String book_publisher, String book_isbn, int book_number_of_pages,
			int book_yearWhere) {
		super();
		this.id = id;
		this.book_title = book_title;
		this.book_publisher = book_publisher;
		this.book_isbn = book_isbn;
		this.book_number_of_pages = book_number_of_pages;
		this.book_yearWhere = book_yearWhere;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBook_title() {
		return book_title;
	}

	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}

	public String getBook_publisher() {
		return book_publisher;
	}

	public void setBook_publisher(String book_publisher) {
		this.book_publisher = book_publisher;
	}

	public String getBook_isbn() {
		return book_isbn;
	}

	public void setBook_isbn(String book_isbn) {
		this.book_isbn = book_isbn;
	}

	public int getBook_number_of_pages() {
		return book_number_of_pages;
	}

	public void setBook_number_of_pages(int book_number_of_pages) {
		this.book_number_of_pages = book_number_of_pages;
	}

	public int getBook_yearWhere() {
		return book_yearWhere;
	}

	public void setBook_yearWhere(int book_yearWhere) {
		this.book_yearWhere = book_yearWhere;
	}

	@Override
	public String toString() {
		return "BookDetails [id=" + id + ", book_title=" + book_title + ", book_publisher=" + book_publisher
				+ ", book_isbn=" + book_isbn + ", book_number_of_pages=" + book_number_of_pages + ", book_yearWhere="
				+ book_yearWhere + "]";
	}

}
