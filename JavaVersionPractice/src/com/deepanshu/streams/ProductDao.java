package com.deepanshu.streams;

public class ProductDao {

	// variables
	private String productName;
	private String productCategory;
	private double price;
	private boolean availability;

	public ProductDao(String productName, String productCategory, double price, boolean availability) {
		super();
		this.productName = productName;
		this.productCategory = productCategory;
		this.price = price;
		this.availability = availability;
	}

	public String getProductName() {
		return productName;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public double getPrice() {
		return price;
	}

	public boolean isAvailability() {
		return availability;
	}

}
