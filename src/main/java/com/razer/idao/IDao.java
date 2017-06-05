package com.razer.idao;

import com.razer.model.ProductList;

public interface IDao {
	
	void addProduct(ProductList pl );
	String retriveProduct();
	public void delete(int id);
	ProductList fetchproduct(int id);
	void updateProduct(ProductList pl);
	void setProductStatus(int id, String status);
    String retriveProductByStatus();
    String allmouse();
    String allmpad();
    String allKeybord();
}

