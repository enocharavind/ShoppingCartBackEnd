package com.niit.shoppingcart;

import static org.junit.Assert.*;



import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.model.Product;

public class TestCaseProduct {

	@Autowired
	ProductDAO productDAO;
	@Autowired
	Product product;
	
	AnnotationConfigApplicationContext context;
	
	@Before
	public void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		productDAO = (ProductDAO)context.getBean("productDAO");
		product = (Product)context.getBean("product");
	}
	
	
	@Test
	public void productAddTestCase()
	{
		product.setId("PRO_005");
		product.setName("dell");
		product.setDescription("this is dell");
		product.setPrice("70000");
		
		assertEquals(productDAO.save(product),true);
	}

	
	
	/*@Test
	public void productListTestCase()
	{
		List<Product> list = productDAO.list();
		int rowCount = list.size();
		assertEquals("Product List Test Case", rowCount,);
	}*/
	
	@Test
	public void deleteTestCase(){
		product.setId("PRO_001");
		assertEquals(productDAO.delete(product),true);
	}
	
	@Test
	public void updateTestCase(){
		product.setId("PRO_004");
		product.setName("asus");
		product.setDescription("this is asus");
		product.setPrice("15000");
		assertEquals(productDAO.update(product),true);
	}

	@Test
	public void getProductTestCase(){
		product=productDAO.get("PRO_004");
		System.out.println(product.getDescription());
		assertEquals(product.getName(),"asus");
	}
	
	
	
	
	
	

}
