package com.example.service.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableDiscoveryClient
public class EduardoSantanaComp303Assignment4Service1Application implements WebMvcConfigurer {

	private static final String serviceName = "seeker-service"; 
	
	public static void main(String[] args) {
		SpringApplication.run(EduardoSantanaComp303Assignment4Service1Application.class, args);
		System.setProperty("spring.config.name", serviceName);
		System.out.println(serviceName + " Micro-service is ready....");	
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("index");
		registry.addViewController("/actuator/info").setViewName("index");
	}
	
}
