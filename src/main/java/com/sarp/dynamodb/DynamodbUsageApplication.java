package com.sarp.dynamodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sarp.dynamodb.model.Person;
import com.sarp.dynamodb.repository.PersonRepository;

@SpringBootApplication
public class DynamodbUsageApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DynamodbUsageApplication.class, args);
	}
	
	@Autowired
	PersonRepository personRepository;

	@Override
	public void run(String... arg0) throws Exception {
		this.personRepository.save(new Person("name", "surname", "password"));
	}
}
