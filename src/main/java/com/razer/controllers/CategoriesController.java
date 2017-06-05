package com.razer.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.razer.iservice.CategoriesIService;
import com.razer.model.CategoriesModel;


@Controller
public class CategoriesController {

	@Autowired
	CategoriesIService cis;
	static int count = 1;
	String cat_name;
    

	@RequestMapping("adminmanagecat")
	public ModelAndView manageCategories() {
		ModelAndView mvc = new ModelAndView("ManageCategory", "mcat", new CategoriesModel());
		String categorylist = cis.retrieveCategories();
		mvc.addObject("catobj", categorylist);
		return mvc;

	}

	@RequestMapping("adminaddcat")
	public ModelAndView addCategory(CategoriesModel cm) {
        if(count !=0 && cat_name != cm.getCategory_name())
        {
		cis.addCategory(cm);
		count = 0;
		cat_name = cm.getCategory_name();
        }
		ModelAndView mvc = new ModelAndView("ManageCategory", "mcat", new CategoriesModel());
		String categorylist = cis.retrieveCategories();
		mvc.addObject("catobj", categorylist);
		 count=1;
		return mvc;
	}

	@RequestMapping(value = "admindeletecategory", method = RequestMethod.GET)
	public ModelAndView delete(@RequestParam("category_id") int id) {
		cis.deleteCategory(id);
		ModelAndView mvc = new ModelAndView("ManageCategory", "mcat", new CategoriesModel());
		String categorylist = cis.retrieveCategories();
		mvc.addObject("catobj", categorylist);
		return mvc;
	}

	@RequestMapping(value = "adminfetchcat", method = RequestMethod.GET)
	public ModelAndView fetchcat(@RequestParam("category_id") int id) {
		CategoriesModel fcm = cis.fetchCategoryToUpdate(id);
		ModelAndView mvc = new ModelAndView("ManageCategory", "mcat",fcm);
		String categorylist = cis.retrieveCategories();
		mvc.addObject("catobj", categorylist);
		mvc.addObject("userClickedUpdateCategory","true");
		return mvc;
	}
	
	@RequestMapping(value="adminupdatecat",method=RequestMethod.POST)
	public ModelAndView updatecat(CategoriesModel ncm){
        cis.updateCategory(ncm);
		ModelAndView mvc = new ModelAndView("ManageCategory", "mcat", new CategoriesModel());
		String categorylist = cis.retrieveCategories();
		mvc.addObject("catobj", categorylist);
		return mvc;
		
	}
	
	@RequestMapping(value="adminstatus_enable",method=RequestMethod.GET)
   public ModelAndView enablecat(@RequestParam("category_id")int id){
	   String status = "Enabled";
	   cis.setCategoryStatus(id, status);
		ModelAndView mvc = new ModelAndView("ManageCategory", "mcat", new CategoriesModel());
		String categorylist = cis.retrieveCategories();
		mvc.addObject("catobj", categorylist);
		return mvc;
	   
	   
   }
	
	@RequestMapping(value="adminstatus_disable",method=RequestMethod.GET)
	   public ModelAndView disablecat(@RequestParam("category_id")int id){
		   String status = "Disabled";
		   cis.setCategoryStatus(id, status);
			ModelAndView mvc = new ModelAndView("ManageCategory", "mcat", new CategoriesModel());
			String categorylist = cis.retrieveCategories();
			mvc.addObject("catobj", categorylist);
			return mvc;
		   
		   
	   }
	
	
}