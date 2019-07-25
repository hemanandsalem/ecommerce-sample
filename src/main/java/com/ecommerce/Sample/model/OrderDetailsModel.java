package com.ecommerce.Sample.model;

import java.util.List;

public class OrderDetailsModel {
	
	private List<OrderDetail> orderDetails;

	public List<OrderDetail> getProducts() {
		return orderDetails;
	}

	public void setProducts(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

}
