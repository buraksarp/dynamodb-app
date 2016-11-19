package com.sarp.dynamodb.repository;

import java.util.Collection;

import com.sarp.dynamodb.model.Person;

public interface PersonRepository {
	
	void save(Person person);
	Collection<Person> findAll();
	Person get(String name);

}
