package com.ivson.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ivson.spring.domain.User;
import com.ivson.spring.repository.UserRepository;
import com.ivson.spring.service.exception.ObjectNotFoundException;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;

	public User find(Integer id) {
		Optional<User> user = repository.findById(id);
		return user.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Nome: " + User.class.getName()));
	}

	@Override
	public User create(User user) {
		return repository.save(user);
	}

	@Override
	public User delete(int id) {
		User user = findById(id);
		if (user != null) {
			repository.delete(user);
		}
		return user;
	}

	@Override
	public List<User> findAll() {
		return repository.findAll();
	}

	@Override
	public User update(User user) {
		return null;
	}

	@Override
	public User findById(Integer id) {
		
		Optional<User> user = repository.findById(id);		
		return user.orElseThrow(
				() -> new ObjectNotFoundException("Usuario nao encontrado")); 		
	}
}
