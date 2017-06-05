package com.razer.daoimp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.razer.idao.SupplierIDao;
import com.razer.model.ProductList;
import com.razer.model.SupplierModel;


@Repository
public class SupplierDaoImp implements SupplierIDao {

	@Autowired
	SessionFactory sf;

	public void addSupplier(SupplierModel sm) {
		Session ses = sf.openSession();
		Transaction tran = ses.beginTransaction();
		ses.save(sm);
		tran.commit();
		ses.flush();
		ses.close();
		
		
	}

	public String retriveProduct() {
		Session ses = sf.openSession();
		Transaction tran = ses.beginTransaction();
		List slist = ses.createQuery("FROM SupplierModel").list();
		Gson gson = new Gson();
		String jsonNames = gson.toJson(slist);
		tran.commit();
		ses.flush();
		ses.close();
		return jsonNames;
	}

	public void delete(int id) {
		Session ses = sf.openSession();
		Transaction tran = ses.beginTransaction();
		SupplierModel sm = (SupplierModel)ses.get(SupplierModel.class,id);
		ses.delete(sm);
		tran.commit();
		ses.flush();
		ses.close();
		
	}

	public SupplierModel fetchsupplier(int id) {
		Session ses = sf.openSession();
		Transaction tran = ses.beginTransaction();
		SupplierModel fsm = (SupplierModel)ses.get(SupplierModel.class, id);
		tran.commit();
		ses.flush();
		ses.close();
		return fsm;
		
	}

	public void updateSupplier(SupplierModel sm) {
		
		Session ses = sf.openSession();
		Transaction tran = ses.beginTransaction();
		ses.update(sm);
		tran.commit();
		ses.flush();
		ses.close();
		
		
	}


	
}
