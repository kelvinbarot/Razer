package com.razer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="category")
public class CategoriesModel {

	@Id
	@GeneratedValue
	@Column(name = "id")
	int category_id;

	@Column(name = "name")
	String category_name;


	@Column(name = "description")
	String category_description;

	@Column(name = "status")
	String category_status;
	
	
	
	

	public CategoriesModel() {
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public String getCategory_description() {
		return category_description;
	}

	public void setCategory_description(String category_description) {
		this.category_description = category_description;
	}

	public String getCategory_status() {
		return category_status;
	}

	public void setCategory_status(String category_status) {
		this.category_status = category_status;
	}

	
	
}
