package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.CartItem;

public interface CartItemDAO {

	void save(CartItem cartItem);
	
	void update(CartItem cartItem);

	void delete(String cartItemId);

	CartItem getCartItem(String cartItemId);

	List<CartItem> getCartItemsByCustomerId(String customerId);

	List<CartItem> listCartItems();

}
