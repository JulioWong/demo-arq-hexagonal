package com.hexagonal.demo.application.repository;

import com.hexagonal.demo.domain.User;

public interface UserRepository {
	
	User findById(Long id);
	
	User save(User user);
	
}
