package com.razer.daoimp;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.razer.idao.UserCredentialIDao;
import com.razer.model.UserCredentialModel;

@Repository
public class UserCredentialDaoImp implements UserCredentialIDao {

	@Autowired
	SessionFactory sf;

	public void addUserCredential(UserCredentialModel ucm) {
		Session ses = sf.openSession();
		Transaction tran = ses.beginTransaction();
		ses.save(ucm);
		tran.commit();
		ses.flush();
		ses.close();

	}

	public String retriveUserCredential() {
		Session ses = sf.openSession();
		Transaction tran = ses.beginTransaction();
		List userClist = ses.createQuery("from UserCredentialModel").list();
		Gson gson = new Gson();
		String userc = gson.toJson(userClist);
		tran.commit();
		ses.flush();
		ses.close();
		return userc;
	}

	public UserCredentialModel fetchUserCById(String username) {
		Session ses = sf.openSession();
		Transaction tran = ses.beginTransaction();
		UserCredentialModel usercredentialobj = (UserCredentialModel) ses.get(UserCredentialModel.class, username);
		tran.commit();
		ses.flush();
		ses.close();
		return usercredentialobj;
	}

	public void updateUserCredentials(UserCredentialModel ucm) {
		Session ses = sf.openSession();
		Transaction tran = ses.beginTransaction();
		ses.update(ucm);
		tran.commit();
		ses.flush();
		ses.close();

	}

	public long getTotalNumberOfActiveUsers() {
		long total_active_user;
		Session ses = sf.openSession();
		Transaction tran = ses.beginTransaction();
		Criteria criteria = ses.createCriteria(UserCredentialModel.class);
		criteria.add(Restrictions.eq("role", "ROLE_USER"));
		criteria.add(Restrictions.eq("enabled", true));
		criteria.setProjection(Projections.rowCount());
		total_active_user = (Long) criteria.uniqueResult();
		tran.commit();
		ses.flush();
		ses.close();
		return total_active_user;
	}

}
