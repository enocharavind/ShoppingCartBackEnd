package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.OrderedItem;

public interface OrderedItemDAO {

	void save(OrderedItem orderedItems );
	
	void update(OrderedItem orderedItems );
	
	void delete(String orderedItemId);
	
	List<OrderedItem> listOrderedItems();
}
