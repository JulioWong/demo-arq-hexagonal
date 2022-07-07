package com.hexagonal.demo.infraestructure.config.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.hexagonal.demo.infraestructure")
public class SpringBootService {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootService.class, args);
	}

}
