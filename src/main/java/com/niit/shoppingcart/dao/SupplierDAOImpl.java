package com.niit.shoppingcart.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.modal.Supplier;
@Repository(value="Supplier")
public class SupplierDAOImpl  implements SupplierDAO{
	@Autowired
	private SessionFactory sessionFactory;
	public SupplierDAOImpl(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	@Transactional
public boolean save(Supplier supplier){
	try {
		sessionFactory.getCurrentSession().save(supplier);
		return true;
	} catch (HibernateException e) {
		e.printStackTrace();
		return false;
	}
}
	@Transactional
	public  boolean update(Supplier supplier){
		try {
			sessionFactory.getCurrentSession().update(supplier);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	@Transactional
	@SuppressWarnings("unchecked")
	public Supplier get(String id){
		//select * from category where id='101'// we giving qotations because  we have taken varchar
				String hql=" from Categroy where id =" + " ' " + id + " ' ";
				Query query=sessionFactory.getCurrentSession().createQuery(hql);
				List<Supplier> list=query.list();
				 if(list==null){
					 return null;
				 }
				 else
				 {
					 return list.get(0);
				 }
		
		}
		
	
	@Transactional
	@SuppressWarnings("unchecked")
	public List<Supplier> list(){
String hql ="from Supplier";
		
		Query query =sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}

	public boolean delete(Supplier supplier) {
		try {
			sessionFactory.getCurrentSession().delete(supplier);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}
	
}
