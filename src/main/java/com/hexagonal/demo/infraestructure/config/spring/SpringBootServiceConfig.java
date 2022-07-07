package com.hexagonal.demo.infraestructure.config.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hexagonal.demo.application.repository.UserRepository;
import com.hexagonal.demo.application.service.UserService;

@Configuration
public class SpringBootServiceConfig {
	@Bean
	public UserService userService(UserRepository userRepository) {
		return new UserService(userRepository);
	}
}
