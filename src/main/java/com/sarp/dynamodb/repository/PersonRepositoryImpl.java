package com.sarp.dynamodb.repository;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.sarp.dynamodb.model.Person;

@Repository
public class PersonRepositoryImpl implements PersonRepository{
	
	private final DynamoDBMapper dynamoDBMapper;
	
	@Autowired
	public PersonRepositoryImpl(DynamoDBMapper dynamoDBMapper) {
		this.dynamoDBMapper = dynamoDBMapper;		
	}

	@Override
	public void save(Person person) {
		dynamoDBMapper.save(person);
	}

	@Override
	public Collection<Person> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person get(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
