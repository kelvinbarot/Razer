package com.razer.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.razer.idao.UserIDao;
import com.razer.iservice.UserIService;
import com.razer.model.UserModel;

@Service
public class UserServiceImp implements UserIService {

	@Autowired
	UserIDao uid;

	public void addUser(UserModel um) {
		uid.addUser(um);
		
	}

	public String retriveUser() {
		
		return uid.retriveUser();
	}

	public UserModel fetchUserById(int id) {
		
		return uid.fetchUserById(id);
	}

	public void deleteUser(int id) {
		uid.deleteUser(id);
		
	}

	public void updateUser(UserModel um) {
		uid.updateUser(um);
		
	}

	public long getTotalUsers() {
		
		return uid.getTotalUsers();
	}
}
