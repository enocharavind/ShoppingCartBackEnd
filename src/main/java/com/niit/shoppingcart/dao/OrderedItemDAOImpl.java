package com.niit.shoppingcart.dao;


	import java.util.List;

	import org.hibernate.SessionFactory;
	import org.hibernate.query.Query;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;
	import org.springframework.transaction.annotation.Transactional;

	import com.niit.shoppingcart.dao.OrderedItemDAO;
	import com.niit.shoppingcart.model.OrderDetail;
import com.niit.shoppingcart.model.OrderedItem;


	@Repository("orderedItemDAO")
	public class OrderedItemDAOImpl implements OrderedItemDAO {

		@Autowired
		SessionFactory sessionFactory;

		public OrderedItemDAOImpl(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}

		@Transactional
		public void save(OrderedItem orderedItems) {
			sessionFactory.getCurrentSession().save(orderedItems);

		}
		@Transactional
		public void update(OrderedItem orderedItems) {
			// TODO Auto-generated method stub
			sessionFactory.getCurrentSession().update(orderedItems);
		}


		@Transactional
		public void delete(String orderedItemId) {
			OrderedItem orderedItemsTodelete = new OrderedItem();
			orderedItemsTodelete.setOrderedItemId(orderedItemId);
			sessionFactory.getCurrentSession().delete(orderedItemsTodelete);

		}

		@Transactional
		public List<OrderedItem> listOrderedItems() {
			String hql="from OrderedItems";
			Query query = sessionFactory.getCurrentSession().createQuery(hql);
			List<OrderedItem> listOfOrderedItems = query.getResultList();
			return listOfOrderedItems;
		}

		
	}


