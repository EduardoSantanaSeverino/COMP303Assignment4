package com.example.web.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableDiscoveryClient
public class YdelmaRangelComp303Assignment4Web3Application implements WebMvcConfigurer{
	
	
	public static void main(String[] args) {
		SpringApplication.run(YdelmaRangelComp303Assignment4Web3Application.class, args);
		System.out.println("------------------------------------------");
		System.out.println("   Spring Boot Web 3 Started              ");
		System.out.println("------------------------------------------");
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("index");
		registry.addViewController("/actuator/info").setViewName("index");
	}


	
}
