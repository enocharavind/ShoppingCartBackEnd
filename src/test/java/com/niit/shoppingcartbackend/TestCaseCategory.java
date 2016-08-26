package com.niit.shoppingcartbackend;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.modal.Category;

public class TestCaseCategory {

	@Autowired
	CategoryDAO categoryDAO;

	@Autowired
	Category category;
	
	AnnotationConfigApplicationContext context;
	
	@Before
	public void init(){
		
		context =new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		context.refresh();
		
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
		category = (Category) context.getBean("category");
		
		
	}
	@Test
	public void categoryListTestCase(){
		
		List<Category> list =categoryDAO.list();
		int rowCount = list.size();
		
		assertEquals("category list test case",rowCount,0);
	}
	public void addtestcase(){
		category.setId("cg001");
		category.setDescription("hiii");
		category.setName("assasa");
		categoryDAO.save(category);
	}
	 public void categoryGetTestCase(){
		 category =categoryDAO.get("CG001");
		 assertEquals(category.getName(),"assasa");
	 }
	
	
	
	
	
	
	
	
	
}
