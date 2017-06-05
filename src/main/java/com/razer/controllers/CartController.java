/*package com.razer.controllers;

import java.security.Security;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.SecurityContextProvider;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.razer.iservice.CartIService;
import com.razer.iservice.IService;
import com.razer.model.CartModel;
import com.razer.model.ProductList;

@Controller
public class CartController {
	
	@Autowired
	CartIService cis;
	@Autowired
	CartModel cart;
	
	@Autowired
	IService is;
	@Autowired
	ProductList pl;
	
	@RequestMapping("Cartadd" )
	ModelAndView cartpage(@RequestParam ("id")int id,HttpSession session){
		 pl =is.fetchproduct(id);
	   cart.setProduct_name(pl.getProduct_name());
	   cart.setPrice(pl.getProduct_price());
	   //String username;  set username from security context holder
	   cart.setUsername("kelvin");
	   cis.addCart(cart);
		ModelAndView mvc = new ModelAndView("cart");
		return mvc;
	}

}*/
