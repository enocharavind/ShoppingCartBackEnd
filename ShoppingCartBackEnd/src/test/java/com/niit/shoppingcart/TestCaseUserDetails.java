package com.niit.shoppingcart;

import static org.junit.Assert.*;





import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.UserDetailsDAO;
import com.niit.shoppingcart.model.UserDetails;

public class TestCaseUserDetails {

	@Autowired
	UserDetailsDAO userDetailsDAO;
	@Autowired
	UserDetails userDetails;
	
	AnnotationConfigApplicationContext context;
	
	@Before
	public void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		userDetailsDAO = (UserDetailsDAO)context.getBean("userDetailsDAO");
		userDetails = (UserDetails)context.getBean("userDetails");
	}
	/*
	@Test
	public void userDetailsListTestCase()
	{
		List<UserDetails> list = userDetailsDAO.list();
		int rowCount = list.size();
		assertEquals("UserDetails List Test Case", rowCount,2);
	}*/
	
	@Test
	public void userDetailsAddTestCase()
	{
		userDetails.setId("88_09");
		userDetails.setName("aravind");
		userDetails.setPassword("ara34");
		userDetails.setEmail("hi.com");
		userDetails.setContact("9959");
		userDetails.setAddress("noiujk"); 
		assertEquals(userDetailsDAO.save(userDetails), true);
	}
	
	/*@Test
	public void deleteTestCase(){
		userDetails.setId("MOB_002");
		assertEquals(userDetailsDAO.delete(userDetails),true);
	}
	
	@Test
	public void updateTestCase(){
		userDetails.setId("MOB_003");
		userDetails.setName("asus");
		userDetails.setDescription("this is asus");
		assertEquals(userDetailsDAO.update(userDetails),true);
	}*/
/*
	@Test
	public void getUserDetailsTestCase(){
	userDetails=userDetailsDAO.get("cg001");
	System.out.println(userDetails.getPassword());
	assertEquals(userDetails.getName(), "iphone");
	}
	
	*/
	
	
	
	

}
