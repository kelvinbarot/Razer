/*package com.razer.daoimp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.razer.idao.CartIDao;
import com.razer.model.CartModel;
@Repository
public class CartDaoImp implements CartIDao {

	@Autowired
	SessionFactory sf;
	public void addCart(CartModel cm) {
		Session ses = sf.openSession();
		Transaction tran = ses.beginTransaction();
		ses.save(cm);
		tran.commit();
		ses.flush();
		ses.close();
		
	}

}*/
