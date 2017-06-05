package com.razer.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.razer.idao.UserCredentialIDao;
import com.razer.iservice.UserCredentialIService;
import com.razer.model.UserCredentialModel;

@Service
public class UserCredentilServiceImp implements UserCredentialIService{
	@Autowired
	UserCredentialIDao user_idao;

	public void addUserCredential(UserCredentialModel ucm) {
		user_idao.addUserCredential(ucm);
		
	}

	public String retriveUserCredential() {
		
		return user_idao.retriveUserCredential();
	}

	public UserCredentialModel fetchUserCById(String username) {
		
		return user_idao.fetchUserCById(username);
	}

	public void updateUserCredentials(UserCredentialModel ucm) {
		user_idao.updateUserCredentials(ucm);
		
	}

	public long getTotalNumberOfActiveUsers() {
		
		return user_idao.getTotalNumberOfActiveUsers();
	}

}
