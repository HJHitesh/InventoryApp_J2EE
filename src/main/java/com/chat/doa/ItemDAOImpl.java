package com.chat.doa;

import java.util.List;

import org.hibernate.Session;

import com.chat.config.HibernateUtil;
import com.chat.entity.Item;

public class ItemDAOImpl implements ItemDAO {
	

	public List<Item> getAllItems() {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        List<Item> items = session.createQuery("from Item", Item.class).list();
	        session.close();
	        return items;
	 }

}
