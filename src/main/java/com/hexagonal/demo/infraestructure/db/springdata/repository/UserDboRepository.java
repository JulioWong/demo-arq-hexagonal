package com.hexagonal.demo.infraestructure.db.springdata.repository;

import org.springframework.stereotype.Service;

import com.hexagonal.demo.application.repository.UserRepository;
import com.hexagonal.demo.domain.User;
import com.hexagonal.demo.infraestructure.db.springdata.mapper.UserEntityMapper;

@Service
public class UserDboRepository implements UserRepository {

	private SpringDataUserRepository springDataUserRepository;
	private UserEntityMapper userMapper;
	
	public UserDboRepository(SpringDataUserRepository springDataUserRepository, UserEntityMapper userMapper) {
		this.springDataUserRepository = springDataUserRepository;
		this.userMapper = userMapper;
	}

	@Override
	public User findById(Long id) {
		return userMapper.toDomain(springDataUserRepository.findById(id).orElseThrow());
	}

	@Override
	public User save(User user) {
		return userMapper.toDomain(springDataUserRepository.save(userMapper.toDbo(user)));
	}
}
