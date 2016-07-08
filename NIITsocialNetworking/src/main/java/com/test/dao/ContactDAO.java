package com.test.dao;

import java.util.List;

import com.test.model.Contact;


public interface ContactDAO {

	public void saveMessage(Contact contact);
	public List<Contact> getAllMessages();
}
