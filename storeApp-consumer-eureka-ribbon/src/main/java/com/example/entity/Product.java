package com.example.entity;


public class Product {

	
	private Integer id;
	
	private String name;

	private Double price;

	public Product() {
	}

	public Product( String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Price [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
