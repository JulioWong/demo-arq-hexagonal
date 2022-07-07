package com.hexagonal.demo.infraestructure.rest.spring.resources;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hexagonal.demo.application.service.UserService;
import com.hexagonal.demo.domain.User;
import com.hexagonal.demo.infraestructure.rest.spring.dto.UserDto;
import com.hexagonal.demo.infraestructure.rest.spring.mapper.UserMapper;

@RestController
@SuppressWarnings("unused")
public class Resources {

	private UserService userService;

	private UserMapper userMapper;
	   
	public Resources(UserService userService, UserMapper userMapper) {
		super();
		this.userService = userService;
		this.userMapper = userMapper;
	}

	@GetMapping("users/user/{id}")
	public ResponseEntity<UserDto> getUserById(@PathVariable Long id) {
		return new ResponseEntity<>(userMapper.toDto(userService.getUser(id)), HttpStatus.OK);
	}
	 
	@PostMapping("users")
	public ResponseEntity<UserDto> saveUser(@RequestBody UserDto userDto) {

	    return new ResponseEntity<>(userMapper.toDto(userService.saveUser(userMapper.toDomain(userDto))),
	        HttpStatus.CREATED);   

	 }
}
