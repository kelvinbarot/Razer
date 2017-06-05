package com.razer.idao;

import com.razer.model.UserModel;

public interface UserIDao {

	void addUser(UserModel um);
	String retriveUser();
	UserModel fetchUserById(int id);
	void deleteUser(int id);
	void updateUser(UserModel um);
	long getTotalUsers();
}
