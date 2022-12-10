package com.azhagar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azhagar.Entity.Contact;

public interface IContactRespository extends JpaRepository<Contact, Integer> {

}
