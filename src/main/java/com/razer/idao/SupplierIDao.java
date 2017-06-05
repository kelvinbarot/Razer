package com.razer.idao;


import com.razer.model.SupplierModel;

public interface SupplierIDao {

	 void addSupplier(SupplierModel sm);
	 String retriveProduct();
	 public void delete(int id);
	 SupplierModel fetchsupplier(int id);
	 void updateSupplier(SupplierModel sm);
}    
	