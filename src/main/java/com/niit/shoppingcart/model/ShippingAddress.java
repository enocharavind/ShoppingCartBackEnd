package com.niit.shoppingcart.model;

import java.io.Serializable;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;

@Entity
@Component
public class ShippingAddress implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ShippingAddress() {
		this.shippingAddressId = "SHIP" + UUID.randomUUID().toString().substring(24).toUpperCase();
	} 
	
	@Id
	private String shippingAddressId;
	private String user_id;
	private String line1;	
	private String line2;
	private String city;
	private String state;
	private String country;
	private String zipCode;

	public String getShippingAddressId() {
		return shippingAddressId;
	}
	public void setShippingAddressId(String shippingAddressId) {
		this.shippingAddressId = shippingAddressId;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	

	

}
