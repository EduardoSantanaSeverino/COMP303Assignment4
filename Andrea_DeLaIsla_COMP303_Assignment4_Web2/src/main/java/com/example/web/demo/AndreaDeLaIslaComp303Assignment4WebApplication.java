package com.example.web.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableDiscoveryClient
public class AndreaDeLaIslaComp303Assignment4WebApplication implements WebMvcConfigurer  {

	private static final String serviceName = "bloodbank-web2"; 
	
	public static void main(String[] args) {
		SpringApplication.run(AndreaDeLaIslaComp303Assignment4WebApplication.class, args);
		System.setProperty("spring.config.name", serviceName);
		System.out.println(serviceName + " Micro-Service is ready");
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("index");
		registry.addViewController("/actuator/info").setViewName("index");
	}

}
