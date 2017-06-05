package com.razer.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.razer.idao.IDao;
import com.razer.iservice.IService;
import com.razer.model.ProductList;

@Service
public class ServiceImp implements IService {
	
	@Autowired
	IDao idao;

	public void addProduct(ProductList pl) {
		idao.addProduct(pl);
		
	}

	public String retriveProduct() {
		return idao.retriveProduct();
	}

	public void delete(int id) {

		idao.delete(id);
	}

	public ProductList fetchproduct(int id) {
		
		return idao.fetchproduct(id);
	}

	public void updateProduct(ProductList pl) {
		idao.updateProduct(pl);		
	}

	public void setProductStatus(int id, String status) {
		idao.setProductStatus(id, status);
		
	}

	public String retriveProductByStatus() {
		
		return idao.retriveProductByStatus();
	}

	public String allmouse() {
		
		return idao.allmouse();
	}

	public String allmpad() {
		
		return idao.allmpad();
	}

	public String allKeybord() {
		
		return idao.allKeybord();
	}

}
