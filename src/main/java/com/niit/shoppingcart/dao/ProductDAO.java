package com.niit.shoppingcart.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.modal.Product;

@Repository
public interface ProductDAO {

	// declare curd operation
	public boolean save(Product product);
	
	public  boolean update(Product product);
	
	public  boolean delete(Product product);
	
	public Product get(String id);
	
	public List<Product> list();
	
}
