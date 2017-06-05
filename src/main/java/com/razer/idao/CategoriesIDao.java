
package com.razer.idao;

import com.razer.model.CategoriesModel;

public interface CategoriesIDao {
	void addCategory(CategoriesModel cm);

	String retrieveCategories();

	CategoriesModel fetchCategoryToUpdate(int id);

	void deleteCategory(int id);

	void updateCategory(CategoriesModel catmod);

	void setCategoryStatus(int id, String status);
	
	String retriveCategoryByStatus();

}
