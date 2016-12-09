package com.niit.shoppingcart.dao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.CardDetailsDAO;
import com.niit.shoppingcart.model.CardDetails; 

@Repository("cardDetailsDAO")
public class CardDetaillsDAOImpl implements CardDetailsDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public CardDetaillsDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public void save(CardDetails cardDetail) {
	sessionFactory.getCurrentSession().save(cardDetail);

	}

	public void update(CardDetails cardDetail) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(cardDetail);

	}

}