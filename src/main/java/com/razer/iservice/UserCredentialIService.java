package com.razer.iservice;

import com.razer.model.UserCredentialModel;

public interface UserCredentialIService {
	
	void addUserCredential(UserCredentialModel ucm);
	String retriveUserCredential();
	UserCredentialModel fetchUserCById(String username);
	void updateUserCredentials(UserCredentialModel ucm);
	long getTotalNumberOfActiveUsers();

}
