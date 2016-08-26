package com.niit.shoppingcartbackend;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.niit.shoppingcart.dao.ProductDAO;

import com.niit.shoppingcart.modal.Product;

public class TestCaseProduct {

	// to write test case for product ,we need productDAO and product object//
	@Autowired
	ProductDAO productDAO;
	
	@Autowired
	Product product;
	
	AnnotationConfigApplicationContext context;
	
	//we should write a method to intialize object//
	
	@Before
	public void init(){
		context =new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		productDAO = (ProductDAO) context.getBean("productDAO");
		product = (Product) context.getBean("product");
		
	}
	@Test
	public void deleteProductTestCase(){
		
		product.setId("PRO_001");
		
		boolean flag=productDAO.delete(product);
		assertEquals("deleteProductTestCase",flag,true);
	}
	
@Test
public void addProductTestCase(){
	product.setId("mob_001");
	product.setName("iphone");
	product.setDescription("this is iphone");
	product.setPrice(100);
	
	
	assertEquals("addProducttestcase",productDAO.save(product),true );
	
}
	
	@Test
	public void listProductTestCase(){
		
		assertEquals("addProductTestCase", productDAO.list().size(),0);		
	}
	@Test
	public void updateProductTestCase(){
		
		product.setId(" mob_004");
		product.setName("lenovo");
		product.setDescription("this is lenovo k4");
		product.setPrice(2000);
	assertEquals("updateProductTestCase",productDAO.update(product),true);
	}
	
	@Test
	public void getProductTestCase(){
		assertEquals("updateProductTestCase",productDAO.get("mob_008"),null);
	
	}
	
	
	
}
