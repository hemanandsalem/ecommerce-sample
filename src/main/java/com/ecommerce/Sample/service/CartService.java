package com.ecommerce.Sample.service;

import java.util.List;

import com.ecommerce.Sample.entity.CartProducts;

public interface CartService{
	public void addToCart(List<CartProducts> productList);
	
	public List<CartProducts> getCartByUserName(String username);
	
	public List<CartProducts> getAllCartProducts();
	
	public void removeFromCart(String productId, String username);
	
	public void clearCart(String username);
}