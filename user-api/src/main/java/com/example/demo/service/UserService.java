package com.example.demo.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.module.UserModule;
import com.example.demo.repository.UserRepository;


@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public List<UserModule> getAllUsers() {
		/*
		List<UserModule> users = new ArrayList<>();
		users.add(new UserModule(101,"Vinuta",35));
		users.add(new UserModule(102,"Karan",55));
		users.add(new UserModule(103,"Ram",19));
		users.add(new UserModule(104,"John",72));
		users.add(new UserModule(105,"Michael",40));
		*/
		
		List<UserModule> users = new ArrayList<>();
		userRepository.findAll().forEach(users::add);
		return users;
	}

	public UserModule addUser(UserModule user) {
		return userRepository.save(user);
		
	}

	public UserModule updateUser(String id,UserModule user) {
		return userRepository.save(user);
	}

	public void deleteUser(String id) {
		userRepository.deleteById(id);
	}

}
