package com.example.service.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class YdelmaRangelComp303Assignment4Service3Application implements WebMvcConfigurer {

	private static final String serviceName = "stocks-service3"; 
	
	public static void main(String[] args) {
		SpringApplication.run(YdelmaRangelComp303Assignment4Service3Application.class, args);
		System.setProperty("spring.config.name", serviceName);
		System.out.println(serviceName + " Micro-service is ready....");	
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("index");
		registry.addViewController("/actuator/info").setViewName("index");
	}
	
}