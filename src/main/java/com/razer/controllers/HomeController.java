package com.razer.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.razer.iservice.CategoriesIService;
import com.razer.iservice.IService;
import com.razer.iservice.SupplierIService;
import com.razer.model.ProductList;
import com.razer.model.UserModel;

@Controller
public class HomeController {

	@Autowired
	IService iservice;

	@Autowired
	CategoriesIService cis;
	

	@Autowired
	SupplierIService sis;

	@RequestMapping("/")
	public ModelAndView index(HttpSession session) {
		ModelAndView mvc = new ModelAndView("index","user",new UserModel());
		//String catlist = cis.retriveCategoryByStatus();
		String prodlist = iservice.retriveProduct();
		mvc.addObject("plist", prodlist);
		return mvc;
	}

	@RequestMapping("/mouse")
	public ModelAndView mouse(HttpSession session) {
		ModelAndView mvc = new ModelAndView("Mouse","user",new UserModel());

		String prodlist = iservice.allmouse();
		mvc.addObject("plist", prodlist);
		return mvc;
	}

	@RequestMapping("/mousepad")
	public ModelAndView mousepad(HttpSession session) {
		ModelAndView mvc = new ModelAndView("Mpads","user",new UserModel());
		String prodlist = iservice.allmpad();
		mvc.addObject("plist", prodlist);
		return mvc;
	}

	@RequestMapping("/keybord")
	public ModelAndView keybord(HttpSession session) {
		ModelAndView mvc = new ModelAndView("keybord","user",new UserModel());
		String prodlist = iservice.allKeybord();
		mvc.addObject("plist", prodlist);
		return mvc;
	}

	@RequestMapping("log")
	public String log() {
		return "login";
	}

	@RequestMapping("index")
	public String home() {
		return "index";
	}

}
