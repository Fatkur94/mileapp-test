package com.mileapp.tast.testrestapi;

import com.mileapp.tast.testrestapi.repository.PackageRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = PackageRepository.class)
public class TestRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestRestApiApplication.class, args);
	}

}
