package com.ecommerce.Sample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.Sample.entity.CartProducts;

public interface CartRepository extends JpaRepository<CartProducts, Integer>{
	List<CartProducts> findCartProductsByUserName(String username);
	
//	void deleteByUser(String usernamme);
//	
//	void delete(String usernamme, String productId);
	
}