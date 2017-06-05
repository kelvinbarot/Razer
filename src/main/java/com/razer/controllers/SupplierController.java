package com.razer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.razer.iservice.SupplierIService;
import com.razer.model.SupplierModel;

@Controller
public class SupplierController {
	@Autowired
	SupplierIService sis;
    static int count = 1;
    String sup_name;
	
	@RequestMapping("manages")
	public ModelAndView manageSupplier() {
		ModelAndView mvc = new ModelAndView("ManageSupplier", "ms", new SupplierModel());
		String supplierlist = sis.retriveProduct();
		mvc.addObject("suppobj", supplierlist);

		return mvc;
	}

	@RequestMapping("addSupplier")
	public ModelAndView addSupplier(SupplierModel sup) {
         if(count!=0 && sup_name!=sup.getSupplier_name())
         {
		sis.addSupplier(sup);
		count = 0;
		sup_name = sup.getSupplier_name();
         }
         count=1;
		ModelAndView mvc = new ModelAndView("ManageSupplier", "ms", new SupplierModel());
		String supplierlist = sis.retriveProduct();
		mvc.addObject("suppobj", supplierlist);
		return mvc;

	}

	@RequestMapping(value = "deletes", method = RequestMethod.GET)
	public ModelAndView delete(@RequestParam("supplier_id") int id) {
		sis.delete(id);
		ModelAndView mvc = new ModelAndView("ManageSupplier", "ms", new SupplierModel());
		String supplierlist = sis.retriveProduct();
		mvc.addObject("suppobj", supplierlist);
		return mvc;

	}

	@RequestMapping(value = "fetchs", method = RequestMethod.GET)
	public ModelAndView fetch(@RequestParam("supplier_id") int id) {
		SupplierModel fsm = sis.fetchsupplier(id);
		ModelAndView mvc = new ModelAndView("ManageSupplier", "ms", fsm);
		String supplierlist = sis.retriveProduct();
		mvc.addObject("suppobj", supplierlist);
		mvc.addObject("userClickedUpdateSupplier","true");
		return mvc;

	}
     @RequestMapping(value="updates",method=RequestMethod.POST)
	public ModelAndView updateDb(SupplierModel nsm){
		sis.updateSupplier(nsm);
		ModelAndView mvc = new ModelAndView("ManageSupplier", "ms", new SupplierModel());
		String supplierlist = sis.retriveProduct();
		mvc.addObject("suppobj", supplierlist);
		return mvc;
		
		
	}

}
