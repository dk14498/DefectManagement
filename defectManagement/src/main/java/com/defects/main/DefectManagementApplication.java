package com.defects.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.defects.repository.DefectRepository;
@ComponentScan(basePackages = {"com.defects"})
@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = DefectRepository.class)
public class DefectManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(DefectManagementApplication.class, args);
	}

}
