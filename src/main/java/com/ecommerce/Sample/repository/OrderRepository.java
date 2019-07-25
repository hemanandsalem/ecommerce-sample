package com.ecommerce.Sample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.Sample.entity.OrderDetails;

public interface OrderRepository extends JpaRepository<OrderDetails, String>{
	List<OrderDetails> findByUserName(String username);
}