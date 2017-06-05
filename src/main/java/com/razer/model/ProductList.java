package com.razer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import org.springframework.web.multipart.MultipartFile;


@Entity

public class ProductList {
	@Id
	@GeneratedValue
	@Column(name = "id")
	int product_id;
	@Column(name = "name")
	
	String product_name;
	@Column(name = "description")
	
	String product_des;
	@Column(name = "price")
	float product_price;
	@Column(name = "quantity")
	int product_qty;
	
	int category_id;
	
	int supplier_id;
	
	@Transient
	MultipartFile product_image;
	
	String product_status;

	public ProductList() {

	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_des() {
		return product_des;
	}

	public void setProduct_des(String product_des) {
		this.product_des = product_des;
	}

	public float getProduct_price() {
		return product_price;
	}

	public void setProduct_price(float product_price) {
		this.product_price = product_price;
	}

	public int getProduct_qty() {
		return product_qty;
	}

	public void setProduct_qty(int product_qty) {
		this.product_qty = product_qty;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public int getSupplier_id() {
		return supplier_id;
	}

	public void setSupplier_id(int supplier_id) {
		this.supplier_id = supplier_id;
	}

	public MultipartFile getProduct_image() {
		return product_image;
	}

	public void setProduct_image(MultipartFile product_image) {
		this.product_image = product_image;
	}

	public String getProduct_status() {
		return product_status;
	}

	public void setProduct_status(String product_status) {
		this.product_status = product_status;
	}


	

	}
