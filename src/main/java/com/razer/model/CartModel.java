/*package com.razer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class CartModel {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	int cart_id;
    
	@Column(name="username")
	String username;
	
	@Column (name="price")
	float price;
	
	@Column(name="quantity", columnDefinition="int defult 1", insertable= false)
	int quantity;
	
	@Column(name="order_id")
	int cart_order_id;
	
	@Column(name="product_name")
	String product_name;
	
	
	
	

	public CartModel() {
		
	}

	public int getCart_id() {
		return cart_id;
	}

	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getCart_order_id() {
		return cart_order_id;
	}

	public void setCart_order_id(int cart_order_id) {
		this.cart_order_id = cart_order_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	
	
	
	
}
*/