package com.razer.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.razer.idao.CategoriesIDao;
import com.razer.iservice.CategoriesIService;
import com.razer.model.CategoriesModel;

@Service
public class CategoriesServiceImp implements CategoriesIService {
	
	@Autowired
	CategoriesIDao cid;

	public void addCategory(CategoriesModel cm) {
		cid.addCategory(cm);
		
	}

	public String retrieveCategories() {
		return cid.retrieveCategories();
	}

	public CategoriesModel fetchCategoryToUpdate(int id) {
		return cid.fetchCategoryToUpdate(id);
	}

	public void deleteCategory(int id) {
		cid.deleteCategory(id);		
	}

	public void updateCategory(CategoriesModel catmod) {
		cid.updateCategory(catmod);
		
	}

	public void setCategoryStatus(int id, String status) {
     cid.setCategoryStatus(id, status);		
	}

	public String retriveCategoryByStatus() {
		
		return cid.retriveCategoryByStatus();
	}

}
