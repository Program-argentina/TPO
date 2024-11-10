package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.neo4j.cypherdsl.core.renderer.Configuration;
import org.neo4j.cypherdsl.core.renderer.Dialect;
import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.GraphDatabase;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner { 

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try (var driver = GraphDatabase.driver("neo4j+s://e77bf700.databases.neo4j.io",
			AuthTokens.basic("neo4j", 
			"nWzVWKyE8J6702ojkmfoKm0SmEK3WUncXh23T2kArU4"))) {
			driver.verifyConnectivity();
			System.out.println("Connection established.");
		}
  }


}