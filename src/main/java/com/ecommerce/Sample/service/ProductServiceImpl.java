package com.ecommerce.Sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.Sample.entity.Product;
import com.ecommerce.Sample.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductRepository productRepository;
	
	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public Product getProductById(String productId) {
		return productRepository.findByProductId(productId);
	}

	@Override
	public Product getProductByName(String productName) {
		return productRepository.findByProductName(productName);
	}

}
