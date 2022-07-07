package com.hexagonal.demo.infraestructure.rest.spring.mapper;

import org.mapstruct.Mapper;

import com.hexagonal.demo.domain.User;
import com.hexagonal.demo.infraestructure.rest.spring.dto.UserDto;

@Mapper(componentModel = "spring")
public interface UserMapper {

  UserDto toDto (User user);

  User toDomain(UserDto userDto);
}
