package com.niit.shoppingcartbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.modal.Category;

public class CategoryTest {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		
		
		
		CategoryDAO categoryDAO= (CategoryDAO) context.getBean("categoryDAO");
		
		Category category= (Category) context.getBean("category");
		
		category.setId("CG001");
		category.setName("CNGAme001");
		category.setDescription("this is category001");
		
		if( categoryDAO.save(category) == true){
			System.out.println("category created sucessfully");
		}
		else{
			System.out.println("not able to create the category");
		}
		
	}
	
	
	
}
