package com.ecommerce.Sample.model;

import java.util.List;

import com.ecommerce.Sample.entity.Product;

public class ProductModel {
	
	private List<Product> products;

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> productList) {
		this.products = productList;
	}

}
