package com.ecommerce.Sample.service;

import java.util.List;

import com.ecommerce.Sample.entity.OrderDetails;
import com.ecommerce.Sample.entity.Product;

public interface OrderService{
	public void placeOrder(List<Product> productList);

	public List<OrderDetails> viewMyOrders(String username);
}