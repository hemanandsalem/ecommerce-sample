package com.ecommerce.Sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.Sample.entity.OrderDetails;
import com.ecommerce.Sample.entity.Product;
import com.ecommerce.Sample.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	OrderRepository orderRepository;
	
	@Override
	public void placeOrder(List<Product> productList) {
//		orderRepository.save(productList);
	}

	@Override
	public List<OrderDetails> viewMyOrders(String username) {
		return orderRepository.findByUserName(username);
	}
}