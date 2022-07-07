package com.hexagonal.demo.infraestructure.db.springdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexagonal.demo.infraestructure.db.springdata.dbo.UserEntity;

public interface SpringDataUserRepository extends JpaRepository<UserEntity, Long>{

}
