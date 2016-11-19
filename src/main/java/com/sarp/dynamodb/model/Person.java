package com.sarp.dynamodb.model;

import java.util.Objects;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "Person")
public class Person {
	
	@DynamoDBHashKey(attributeName = "name")
	private String name;
	
	@DynamoDBAttribute(attributeName = "surname")
	private String surname;
	
	@DynamoDBAttribute(attributeName = "password")
	private String password;
	
	public Person(String name, String surname, String password){
		this.name = name;
		this.surname = surname;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	 @Override
	    public boolean equals(Object object) {
	        if (this == object) {
	            return true;
	        }

	        if (object == null || getClass() != object.getClass()) {
	            return false;
	        }

	        Person that = (Person) object;
	        return Objects.equals(this.name, that.name)
	                && Objects.equals(this.surname, that.surname)
	                && Objects.equals(this.password, that.password);

	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(name, surname, password);
	    }

}
