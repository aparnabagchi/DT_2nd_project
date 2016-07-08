package com.test.service;

import java.util.List;

import com.test.model.Contact;

public interface ContactService {

		public void saveMessage(Contact contact);
		public List<Contact> getAllMessages();
}
