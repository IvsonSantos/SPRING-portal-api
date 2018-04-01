package com.ivson.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ivson.spring.domain.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
