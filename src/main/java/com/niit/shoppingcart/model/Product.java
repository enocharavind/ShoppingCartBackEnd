package com.niit.shoppingcart.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;


import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Product {

	@Id
	private String id;
	private String name;
	private String description;
	private String price;
	private String category_id;
		private String supplier_id;
		
		public String getCategory_id() {
		return category_id;
	}
	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}
		

	public String getSupplier_id() {
			return supplier_id;
		}
		public void setSupplier_id(String supplier_id) {
			this.supplier_id = supplier_id;
		}
	
	@ManyToOne
	@JoinColumn(name="category_id" ,updatable=false,insertable=false,nullable=false)
	private Category category;
	
	
	@ManyToOne
	@JoinColumn(name="supplier_id", updatable=false,insertable=false,nullable=false)
	private Supplier supplier;
	
		 public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	

	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
	

}