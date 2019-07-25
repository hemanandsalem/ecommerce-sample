package com.ecommerce.Sample.service;

import java.util.List;

import com.ecommerce.Sample.entity.Product;

public interface ProductService{
	public List<Product> getAllProducts();
	
	public Product getProductById(String productId);
	
	public Product getProductByName(String productName);
	
}