package com.azhagar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azhagar.Entity.Contact;
import com.azhagar.repository.IContactRespository;

@Service
public class ContactServiceImpl implements IContactService {

	@Autowired
	private IContactRespository repo;

	@Override
	public String saveContact(Contact contact) {
		return repo.save(contact).getContactId() != null ? "Records Saved Successfully" : "Records not saved";
	}

	@Override
	public List<Contact> getAllContacts() {
		return repo.findAll();
	}

	@Override
	public Contact getContactById(Integer contactId) {
		Optional<Contact> opt = repo.findById(contactId);
		if (opt.isPresent())
			return opt.get();

		return null;
	}

	@Override
	public String updateContact(Contact contact) {
		boolean existId = repo.existsById(contact.getContactId());
		if (existId)
			return repo.save(contact).getContactId() != null ? "Records Updated" : "Records not available to update";

		return null;
	}

	@Override
	public String deleteContactById(Integer contactId) {
		repo.deleteById(contactId);
		return "Deleted";
	}

}
