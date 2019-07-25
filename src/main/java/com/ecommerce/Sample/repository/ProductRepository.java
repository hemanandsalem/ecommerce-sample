package com.ecommerce.Sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.Sample.entity.Product;


public interface ProductRepository extends JpaRepository<Product,Integer> {
	Product findByProductId(String productId);
	
	Product findByProductName(String productName);
}