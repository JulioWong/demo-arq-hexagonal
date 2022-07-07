package com.hexagonal.demo.application.service;

import com.hexagonal.demo.application.repository.UserRepository;
import com.hexagonal.demo.domain.User;

public class UserService {

	private UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public User getUser(Long id) {
		return userRepository.findById(id);
	}
	
	public User saveUser(User user) {
		return userRepository.save(user);
	}
}
