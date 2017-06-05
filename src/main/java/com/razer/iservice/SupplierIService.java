package com.razer.iservice;


import com.razer.model.SupplierModel;

public interface SupplierIService {

	
	 void addSupplier(SupplierModel sm);
	 String retriveProduct();
	 public void delete(int id);
	 SupplierModel fetchsupplier(int id);
	 void updateSupplier(SupplierModel sm);
}
