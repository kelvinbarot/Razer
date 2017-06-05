package com.razer.daoimp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.razer.idao.UserIDao;
import com.razer.model.UserModel;

@Repository
public class UserDaoImp implements UserIDao {

	@Autowired
	SessionFactory sf;

	public void addUser(UserModel um) {
		Session ses = sf.openSession();
		Transaction tran = ses.beginTransaction();
		ses.save(um);
		tran.commit();
		ses.flush();
		ses.close();

	}

	public String retriveUser() {
		Session ses = sf.openSession();
		Transaction tran = ses.beginTransaction();
		List userlist = ses.createQuery("from UserModel").list();
		Gson gson = new Gson();
		String json = gson.toJson(userlist);
		tran.commit();
		ses.flush();
		ses.close();
		return json;
	}

	public UserModel fetchUserById(int id) {
		Session ses = sf.openSession();
		Transaction tran = ses.beginTransaction();
		UserModel userobj= (UserModel)ses.get(UserModel.class,id);
		tran.commit();
		ses.flush();
		ses.close();
		return userobj;
	}

	public void deleteUser(int id) {
		Session ses = sf.openSession();
		Transaction tran = ses.beginTransaction();
		UserModel userobj = (UserModel)ses.get(UserModel.class, id);
		ses.delete(userobj);
		tran.commit();
		ses.flush();
		ses.close();
		
	}

	public void updateUser(UserModel um) {
		Session ses = sf.openSession();
		Transaction tran = ses.beginTransaction();
		ses.update(um);
		tran.commit();
		ses.flush();
		ses.close();
		
		
	}

	public long getTotalUsers() {
		
		Session ses  = sf.openSession();
		Transaction tran = ses.beginTransaction();
		String hql = "select count(*) from UserModel";
		Query q = ses.createQuery(hql);
		long total_users= (Long)q.uniqueResult();
		return total_users;
	}
	
	

}
