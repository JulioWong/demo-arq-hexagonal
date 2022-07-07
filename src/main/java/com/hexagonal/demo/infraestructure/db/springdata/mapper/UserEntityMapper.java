package com.hexagonal.demo.infraestructure.db.springdata.mapper;

import org.mapstruct.Mapper;

import com.hexagonal.demo.domain.User;
import com.hexagonal.demo.infraestructure.db.springdata.dbo.UserEntity;

@Mapper(componentModel = "spring")
public interface UserEntityMapper {
	User toDomain(UserEntity userEntity);

	UserEntity toDbo(User user);
}
