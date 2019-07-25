package com.ecommerce.Sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.Sample.entity.CartProducts;
import com.ecommerce.Sample.repository.CartRepository;

@Service
public class CartServiceImpl implements CartService{

	@Autowired
	CartRepository cartRepository;

	@Override
	public void addToCart(List<CartProducts> productList) {
		cartRepository.save(productList);
	}

	@Override
	public List<CartProducts> getCartByUserName(String username) {
		return cartRepository.findCartProductsByUserName(username);
	}

	@Override
	public List<CartProducts> getAllCartProducts() {
		return cartRepository.findAll();
	}

	@Override
	public void removeFromCart(String productId, String username) {
//		cartRepository.delete(username, productId);
	}

	@Override
	public void clearCart(String username) {
//		cartRepository.deleteByUser(username);
	}

}