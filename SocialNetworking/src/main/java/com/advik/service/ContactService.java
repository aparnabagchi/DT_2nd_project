package com.advik.service;

import java.util.List;

import com.advik.model.Contact;

public interface ContactService {

		public void saveMessage(Contact contact);
		public List<Contact> getAllMessages();
}
