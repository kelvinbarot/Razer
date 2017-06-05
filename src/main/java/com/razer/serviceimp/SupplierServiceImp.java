package com.razer.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.razer.idao.SupplierIDao;
import com.razer.iservice.SupplierIService;
import com.razer.model.ProductList;
import com.razer.model.SupplierModel;


@Service
public class SupplierServiceImp implements SupplierIService {
	
	@Autowired
	SupplierIDao sid;

	public void addSupplier(SupplierModel sm) {
		sid.addSupplier(sm);
		
	}

	public String retriveProduct() {
		
		return sid.retriveProduct();
	}

	public void delete(int id) {
		
		sid.delete(id);
	}

	public SupplierModel fetchsupplier(int id) {
		
		return sid.fetchsupplier(id);
	}

	public void updateSupplier(SupplierModel sm) {
		sid.updateSupplier(sm);
		
	}



}
