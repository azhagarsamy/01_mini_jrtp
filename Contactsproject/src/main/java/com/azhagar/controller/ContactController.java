package com.azhagar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.azhagar.Entity.Contact;
import com.azhagar.service.IContactService;

@RestController
public class ContactController {

	@Autowired
	private IContactService service;

	@PostMapping("/save")
	public String saveContact(@RequestBody Contact contact) {
		return service.saveContact(contact);
	}

	@GetMapping("/getAllContacts")
	public List<Contact> getAllContacts() {
		return service.getAllContacts();
	}

	@GetMapping("/getContactById")
	public Contact getContactById(@RequestParam("contactId") Integer contactId) {
		return service.getContactById(contactId);

	}

	@PutMapping("/update")
	public String updateContact(@RequestBody Contact contact) {
		return service.updateContact(contact);
	}

	@DeleteMapping("/delete/{contactId}")
	public String deleteContactById(@PathVariable("contactId") Integer contactId) {
		return service.deleteContactById(contactId);
	}

}
