package com.ecommerce.Sample.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product{
	
	@Id
	private String productId;
	
	private String productName;
	
	private double price;
	
	private int stock;

	public String getProductId() {
		return productId;
	}
	
	public void setProductId(String productId) {
		this.productId = productId;
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

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
}