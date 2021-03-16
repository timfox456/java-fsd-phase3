package com.example.RestExample.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestExample.entities.User;
import com.example.RestExample.services.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
    Logger logger = LoggerFactory.getLogger(UserController.class);

	
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
	return String.format("Hello %s!", name);
	}
	
	
	@GetMapping("/users")
	public @ResponseBody Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users
        return userService.GetAllUsers();
    }
	
	@PostMapping("/users")
	User newUser(@RequestBody User newUser) {
		return userService.CreateUser(newUser);

	}
	
	@GetMapping("/users/{id}")
	public @ResponseBody User getUserById(@PathVariable int id) {
		
    	logger.info("requesting user " +  id);

		return userService.GetUserById(id);
	}
	
	@PutMapping("/users/{id}")
	User replaceUser(@RequestBody User newUser, @PathVariable Integer id) {
		return userService.UpdateUser(newUser, id);
	}
	
	@DeleteMapping("/users/{id}")
	void deleteUser(@PathVariable Integer id) {
		userService.deleteUser(id);
	}
	
	

}
