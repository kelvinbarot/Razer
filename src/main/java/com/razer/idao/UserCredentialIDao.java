package com.razer.idao;

import com.razer.model.UserCredentialModel;

public interface UserCredentialIDao {
	void addUserCredential(UserCredentialModel ucm);
	String retriveUserCredential();
	UserCredentialModel fetchUserCById(String username);
	void updateUserCredentials(UserCredentialModel ucm);
	long getTotalNumberOfActiveUsers();

}
