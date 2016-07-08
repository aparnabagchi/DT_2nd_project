package com.advik.dao;

import java.util.List;

import com.advik.model.Contact;


public interface ContactDAO {

	public void saveMessage(Contact contact);
	public List<Contact> getAllMessages();
}
