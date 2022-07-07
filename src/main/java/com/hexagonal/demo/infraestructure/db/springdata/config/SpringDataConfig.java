package com.hexagonal.demo.infraestructure.db.springdata.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(
    basePackages = "com.hexagonal.demo.infraestructure.db.springdata.repository")
@EntityScan(basePackages = "com.hexagonal.demo.infraestructure.db.springdata.dbo")
public class SpringDataConfig { }
