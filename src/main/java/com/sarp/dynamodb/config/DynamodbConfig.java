package com.sarp.dynamodb.config;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.PropertiesCredentials;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

@Configuration
public class DynamodbConfig {

	@Bean
	public DynamoDBMapper dynamoDBMapper() throws IOException {
		return new DynamoDBMapper(this.amazonDynamoDB());
	}

	private AmazonDynamoDB amazonDynamoDB() throws IOException {
		final InputStream properties = Thread.currentThread().getContextClassLoader()
				.getResourceAsStream("classpath:aws/aws.properties");
		final AWSCredentials propertiesCredentials = new PropertiesCredentials(properties);
		final AmazonDynamoDB amazonDynamoDb = new AmazonDynamoDBClient(propertiesCredentials);
		amazonDynamoDb.setRegion(Region.getRegion(Regions.US_WEST_2));
		return amazonDynamoDb;
	}

}
