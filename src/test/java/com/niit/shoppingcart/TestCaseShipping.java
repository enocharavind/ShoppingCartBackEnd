package com.niit.shoppingcart;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.dao.ShippingAddressDAO;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Product;
import com.niit.shoppingcart.model.ShippingAddress;

public class TestCaseShipping {

@Autowired
ShippingAddressDAO shippingAddressDAO;
@Autowired
ShippingAddress shippingAddress;

	@Before
	public void init()
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
	shippingAddressDAO = (ShippingAddressDAO)context.getBean("shippingAddressDAO");
		shippingAddress = (ShippingAddress)context.getBean("shippingAddress");
	
}
	
	@Test
	public void supplierAddTestCase()
	{
		shippingAddress.setUser_id("55676");
		shippingAddress.setCity("hyd");
		shippingAddress.setCountry("india");
		shippingAddress.setLine1("hello");
		shippingAddress.setLine2("hi");
	assertEquals(shippingAddressDAO.saveOrUpdate(shippingAddress), true);
	}
	




}