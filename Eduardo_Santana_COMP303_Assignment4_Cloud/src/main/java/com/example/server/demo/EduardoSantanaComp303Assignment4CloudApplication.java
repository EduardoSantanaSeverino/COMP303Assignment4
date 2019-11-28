package com.example.server.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableEurekaServer
public class EduardoSantanaComp303Assignment4CloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(EduardoSantanaComp303Assignment4CloudApplication.class, args);
		System.out.println("Spring Boot JPA server started");
	}
	
}
