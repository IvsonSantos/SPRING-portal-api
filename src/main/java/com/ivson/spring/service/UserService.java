package com.ivson.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ivson.spring.domain.User;

@Service
public interface UserService {

	public User find(Integer id);
	
	public User create(User user);
	
	public User delete(int id);
	
	public List<User> findAll();
	
	public User update(User user);
	
	public User findById(Integer id);
}
