package com.niit.shoppingcart.dao;

import com.niit.shoppingcart.model.CardDetails;

public interface CardDetailsDAO {
	void save(CardDetails cardDetail);
	void update(CardDetails cardDetail);
}
