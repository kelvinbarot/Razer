package com.razer.controllers;

import java.util.Collection;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.razer.iservice.UserCredentialIService;
import com.razer.iservice.UserIService;
import com.razer.model.UserCredentialModel;
import com.razer.model.UserModel;

@Controller
public class UserController {

	@Autowired
	UserIService uis;

	@Autowired
	UserCredentialIService ucis;

	@RequestMapping(value = "registeruser", method = RequestMethod.POST)
	public ModelAndView addUserDb(UserModel um) {

		ModelAndView mvc = new ModelAndView("index", "user", new UserModel());
		boolean regStatus;
		try {
			UserCredentialModel ucm = new UserCredentialModel();
			uis.addUser(um);
			ucm.setUserName(um.getUserName());
			ucm.setPassword(um.getUser_password());
			ucm.setEnabled(true);
			ucm.setRole("ROLE_USER");
			ucis.addUserCredential(ucm);
			regStatus = true;

		} catch (Exception e) {
			System.out.println("Error in user_credntial" + e);
			regStatus = false;
		}
		mvc.addObject("sucess", regStatus);
		return mvc;
	}

	@RequestMapping("/login")
	public ModelAndView login() {
		//logger.debug("Start of login method");
		ModelAndView mav = new ModelAndView("login", "user", new UserModel());
		//logger.debug("End of login method");
		return mav;
	}

	@RequestMapping(value = "/perform_login", method = RequestMethod.POST)
	public ModelAndView loginChecker(ModelAndView mav, HttpSession session) {

		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		@SuppressWarnings("unchecked")
		Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) SecurityContextHolder.getContext()
				.getAuthentication().getAuthorities();
		String role = "ROLE_USER";
		for (GrantedAuthority authority : authorities) {
			if (authority.getAuthority().equals(role)) {
				mav = new ModelAndView("managep");

			} else {

				mav = new ModelAndView("manages");
				session.setAttribute("loggedinuser", username);

			}
		}
		return mav;
	}
}
