package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.module.UserModule;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<UserModule> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@PostMapping("/users/add-user")
	public UserModule addUser(@RequestBody UserModule user) {
		return userService.addUser(user);
	}
	
	@PutMapping("/users/update-user/{id}")
	public UserModule updateUser(@RequestBody UserModule user, @PathVariable String id) {
		return userService.updateUser(id, user);
	}
	
	@DeleteMapping("/users/delete-user/{id}")
	public void deleteUser(@PathVariable String id) {
		userService.deleteUser(id);
	}

}
