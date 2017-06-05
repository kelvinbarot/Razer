package com.razer.daoimp;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.razer.idao.CategoriesIDao;
import com.razer.model.CategoriesModel;


@Repository
public class CategoriesDaoImp implements CategoriesIDao {
	
	@Autowired
	SessionFactory sf;

	public void addCategory(CategoriesModel cm) {
		Session ses = sf.openSession();
		Transaction tran = ses.beginTransaction();
		ses.save(cm);
		tran.commit();
		ses.flush();
		ses.close();
		
	}

	public String retrieveCategories() {
		Session ses = sf.openSession();
		Transaction tran = ses.beginTransaction();
		List clist = ses.createQuery("FROM CategoriesModel").list();
		Gson gson = new Gson();
		String jsonNames = gson.toJson(clist);
		tran.commit();
		ses.flush();
		ses.close();
		return jsonNames;
	}

	public CategoriesModel fetchCategoryToUpdate(int id) {
		Session ses = sf.openSession();
		Transaction tran = ses.beginTransaction();
		CategoriesModel fsm = (CategoriesModel)ses.get(CategoriesModel.class, id);
		tran.commit();
		ses.flush();
		ses.close();
		return fsm;
	}

	public void deleteCategory(int id) {
		Session ses = sf.openSession();
		Transaction tran = ses.beginTransaction();
		CategoriesModel cm = (CategoriesModel)ses.get(CategoriesModel.class,id);
		ses.delete(cm);
		tran.commit();
		ses.flush();
		ses.close();		
	}

	public void updateCategory(CategoriesModel catmod) {
		Session ses = sf.openSession();
		Transaction tran = ses.beginTransaction();
		ses.update(catmod);
		tran.commit();
		ses.flush();
		ses.close();		
	}

	public void setCategoryStatus(int id, String status) {
       Session ses = sf.openSession();
       Transaction tran = ses.beginTransaction();
       CategoriesModel ncm = (CategoriesModel)ses.get(CategoriesModel.class, id);
       ncm.setCategory_status(status);
       tran.commit();
       ses.flush();
       ses.close();
	}

	public String retriveCategoryByStatus() {
		Session ses = sf.openSession();
		Transaction tran = ses.beginTransaction();
		Criteria cre = ses.createCriteria(CategoriesModel.class);
		cre.add(Restrictions.eq("category_status", "Enabled"));
		//cre.add(Restrictions.eq("category_name", "Mouse"));
		List list = cre.list();
		Gson gson = new Gson();
		String jsonNames = gson.toJson(list);
		tran.commit();
		ses.flush();
		ses.close();
		return jsonNames;
	}

}
