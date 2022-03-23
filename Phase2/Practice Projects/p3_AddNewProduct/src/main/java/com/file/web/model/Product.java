package com.file.web.model;

public class Product {

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	int id;
	String name;
	int price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setCompany(String company) {
		this.price = price;
	}

	public Product(int id, String name, String company) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Product() {
		super();

	}

}
