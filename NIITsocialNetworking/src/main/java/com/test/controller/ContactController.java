package com.test.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.model.Contact;
import com.test.service.ContactService;



@Controller
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	@RequestMapping(value="/contactPage")
	public String contactPage()
	{
		
		return "contactPage";
	}
	
	@RequestMapping(value="/contact",method=RequestMethod.POST)
	public String addContact(@Valid @ModelAttribute("sendMessage") Contact contact , BindingResult result)
	{
		if(result.hasErrors())
		{
			return "contactPage";
		}
		contactService.saveMessage(contact);
	
		return "contactPage";
		
	}
	
	@RequestMapping(value="allMessages")
	public String allMessages(ModelMap map)
	{
		List<Contact> list=contactService.getAllMessages();
		map.addAttribute("message", list);
		return "allMessages";
	}
}
