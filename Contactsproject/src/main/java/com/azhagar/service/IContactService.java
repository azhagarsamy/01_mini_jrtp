package com.azhagar.service;

import java.util.List;

import com.azhagar.Entity.Contact;

public interface IContactService {
	
	public String saveContact(Contact contact);
	
	public List<Contact> getAllContacts();
	
	public Contact getContactById(Integer contactId);
	
	public String updateContact(Contact contact);
	
	public String deleteContactById(Integer contactId);
	

}
