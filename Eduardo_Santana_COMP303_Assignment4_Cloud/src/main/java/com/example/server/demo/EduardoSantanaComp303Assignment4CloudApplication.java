package com.example.server.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EduardoSantanaComp303Assignment4CloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(EduardoSantanaComp303Assignment4CloudApplication.class, args);
		System.out.println("Spring Boot JPA server started");
	}

}
