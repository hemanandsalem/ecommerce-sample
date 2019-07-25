package com.ecommerce.Sample.model;

public class CartDetails{
	private String username;
	
	private String productId;
	
	private String productName;
	
	private double price;
	
	private int quantity;

	public CartDetails() {
		
	}
	
	public CartDetails(String username, String productId, String productName, double price, int quantity) {
		this.username = username;
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
}