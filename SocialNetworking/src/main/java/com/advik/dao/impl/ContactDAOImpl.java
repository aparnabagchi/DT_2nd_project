package com.advik.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.advik.dao.ContactDAO;
import com.advik.model.Contact;

@Repository
public class ContactDAOImpl implements ContactDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveMessage(Contact contact) {
		sessionFactory.getCurrentSession().save(contact);
		
	}

	public List<Contact> getAllMessages() {
		
		return sessionFactory.getCurrentSession().createQuery("from Contact").list();
	}

}
