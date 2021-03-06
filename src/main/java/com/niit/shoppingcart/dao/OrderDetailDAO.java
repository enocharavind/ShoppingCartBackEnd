package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.OrderDetail;

public interface OrderDetailDAO {

	void saveOrUpdate(OrderDetail orderDetail);

	void delete(String orderDetailId);

	List<OrderDetail> listOrderDetails();

}
