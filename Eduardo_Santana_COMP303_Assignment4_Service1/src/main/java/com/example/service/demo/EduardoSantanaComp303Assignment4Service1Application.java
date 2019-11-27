package com.example.service.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EduardoSantanaComp303Assignment4Service1Application {

	private static final String serviceName = "seeker-service"; 
	
	public static void main(String[] args) {
		SpringApplication.run(EduardoSantanaComp303Assignment4Service1Application.class, args);
		System.setProperty("spring.config.name", serviceName);
		System.out.println(serviceName + " Micro-service is ready....");	
	}

}
