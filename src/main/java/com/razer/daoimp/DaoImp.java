package com.razer.daoimp;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.razer.idao.IDao;
import com.razer.model.ProductList;

@Repository
public class DaoImp implements IDao {

	@Autowired
	SessionFactory sf;

	public void addProduct(ProductList pl) {
		Session ses = sf.openSession();
		Transaction tran = ses.beginTransaction();
		pl.setProduct_status("Enabled");
		ses.save(pl);
		tran.commit();
		ses.flush();
		ses.delete(pl);
		ses.close();

	}

	public String retriveProduct() {
		Session ses = sf.openSession();
		Transaction tran = ses.beginTransaction();
		List plist = ses.createQuery("FROM ProductList").list();

		Gson gson = new Gson();
		String jsonNames = gson.toJson(plist);
		tran.commit();

		ses.close();
		return jsonNames;

	}

	public void delete(int id) {

		Session ses = sf.openSession();
		Transaction tran = ses.beginTransaction();
		ProductList Productobj = (ProductList) ses.get(ProductList.class, id);
		ses.delete(Productobj);
		tran.commit();

		ses.close();

	}

	public ProductList fetchproduct(int id) {
		Session ses = sf.openSession();
		Transaction tran = ses.beginTransaction();
		ProductList productobj = (ProductList) ses.get(ProductList.class, id);
		tran.commit();

		ses.close();
		return productobj;
	}

	public void updateProduct(ProductList pl) {
		Session ses = sf.openSession();
		Transaction tran = ses.beginTransaction();
		ses.update(pl);
		tran.commit();

		ses.close();

	}

	public void setProductStatus(int id, String status) {
		Session ses = sf.openSession();
		Transaction tran = ses.beginTransaction();
		ProductList npl = (ProductList) ses.get(ProductList.class, id);
		npl.setProduct_status(status);
		tran.commit();
		ses.flush();
		ses.close();

	}

	public String retriveProductByStatus() {
		Session ses = sf.openSession();
		Transaction tran = ses.beginTransaction();
		Criteria c = ses.createCriteria(ProductList.class);
		c.add(Restrictions.eq("product_status", "Enabled"));
		List prolist = c.list();
		Gson gson = new Gson();
		String pro = gson.toJson(prolist);
		tran.commit();
		ses.flush();
		ses.close();

		return pro;
	}

	public String allmouse() {
		Session ses = sf.openSession();
		Transaction tran = ses.beginTransaction();
		Criteria c = ses.createCriteria(ProductList.class);
		Criterion cid = Restrictions.eq("category_id", 97);
		Criterion cstatus = Restrictions.eq("product_status", "Enabled");
		LogicalExpression le = Restrictions.and(cid, cstatus);
		c.add(le);
		List mouselist = c.list();
		Gson gson = new Gson();
		String mousel = gson.toJson(mouselist);
		tran.commit();
		ses.flush();
		ses.close();
		return mousel;

	}

	public String allmpad() {
		Session ses = sf.openSession();
		Transaction tran = ses.beginTransaction();
		Criteria c = ses.createCriteria(ProductList.class);
		Criterion cid = Restrictions.eq("category_id", 98);
		Criterion pstatus = Restrictions.eq("product_status", "Enabled");
		LogicalExpression le = Restrictions.and(cid, pstatus);
		c.add(le);
		List padlise = c.list();
		Gson gson = new Gson();
		String mp = gson.toJson(padlise);
		tran.commit();
		ses.flush();
		ses.close();
		return mp;

	}

	public String allKeybord() {
		Session ses = sf.openSession();
		Transaction tran = ses.beginTransaction();
		Criteria c = ses.createCriteria(ProductList.class);
		Criterion cid = Restrictions.eq("category_id", 100);
		Criterion pstatus = Restrictions.eq("product_status", "Enabled");
		LogicalExpression le = Restrictions.and(cid, pstatus);
		c.add(le);
		List padlist = c.list();
		Gson gson = new Gson();
		String mp = gson.toJson(padlist);
		tran.commit();
		ses.flush();
		ses.close();
		return mp;
	}
}
