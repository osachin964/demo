package com.stackroute.devsecops;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

//@EnableMongoRepositories(basePackageClasses = StudentRepo.class
public class DevsecopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevsecopsApplication.class, args);
	}

}
