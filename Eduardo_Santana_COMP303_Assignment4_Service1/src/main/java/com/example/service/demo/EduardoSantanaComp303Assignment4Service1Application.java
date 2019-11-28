package com.example.service.demo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.service.demo.seeker.Seeker;
import com.example.service.demo.seeker.SeekerRepository;

@SpringBootApplication
@EnableDiscoveryClient
public class EduardoSantanaComp303Assignment4Service1Application implements WebMvcConfigurer  {

	private static final String serviceName = "seeker-service"; 
	
	public static void main(String[] args) {
		SpringApplication.run(EduardoSantanaComp303Assignment4Service1Application.class, args);
		System.setProperty("spring.config.name", serviceName);
		System.out.println(serviceName + " Micro-service is ready....");	
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("index");
	}
	
	/**
	 * This method is used to load the in memory lists. 
	 * inserting the default objects lists. it is called 
	 * SeedDatabase because it is making the seed.
	 */
	@Bean
	public ApplicationRunner booksInitializer
	(
		SeekerRepository seekerRepository
	) 
	{
		return (args) -> 
		{
			seekerRepository.save(new Seeker("Eduardo", "Santana", "25", "Male", "A+", "Santo Domingo", "+1809-315-8965"));
			seekerRepository.save(new Seeker("Martin", "Emilio", "15", "Male", "B+", "Santo Domingo", "+1809-315-9999"));
			seekerRepository.save(new Seeker("Ricky", "Marting", "35", "Male", "C+", "Santo Domingo", "+1809-315-8888"));
		};
	}

}
