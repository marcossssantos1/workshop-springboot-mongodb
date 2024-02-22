package com.marcossantos.mongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcossantos.mongodb.domain.User;
import com.marcossantos.mongodb.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;

	public List <User> findAll() {
         return repo.findAll();
	}

}
