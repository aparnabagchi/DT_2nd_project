package com.advik.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.advik.dao.ContactDAO;
import com.advik.model.Contact;
import com.advik.service.ContactService;

@Service
@Transactional
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactDAO contactDAO;
	public void saveMessage(Contact contact) {
		
		contactDAO.saveMessage(contact);
	}

	public List<Contact> getAllMessages() {
		
		return contactDAO.getAllMessages();
	}

}
