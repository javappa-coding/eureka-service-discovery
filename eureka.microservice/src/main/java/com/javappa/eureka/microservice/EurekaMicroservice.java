package com.javappa.eureka.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaMicroservice {

	public static void main(String[] args) {
		SpringApplication.run(EurekaMicroservice.class, args);
	}
}


