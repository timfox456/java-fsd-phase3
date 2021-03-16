package com.example.RestExample.services;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RestExample.controllers.UserController;
import com.example.RestExample.entities.User;
import com.example.RestExample.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	 private UserRepository userRepository;
	
    Logger logger = LoggerFactory.getLogger(UserController.class);


    public Iterable<User> GetAllUsers()
    {
        return userRepository.findAll();
    }


    public User GetUserByName(String name) {
        User foundUser = userRepository.findByName(name);
        return foundUser;
    }
    

    public User GetUserById(int id) {
    	Optional<User> foundUser = userRepository.findById(id);
    	
    	logger.info("requesting user " +  id);
    	
    	//TODO: we need to decide how to handle a "Not Found" condition
    	
    	return(foundUser.get());
    }
    
    public User CreateUser(User newUser)
    {
    	return userRepository.save(newUser);
    }
    
    public User UpdateUser(User newUser, Integer id) {
    	return userRepository.findById(id)
    		      .map(user -> {
    		        user.setName(newUser.getName());
    		        user.setPassword(newUser.getPassword());
    		        user.setEmail(newUser.getEmail());
    		        return userRepository.save(user);
    		      })
    		      .orElseGet(() -> {
    		        newUser.setId(id);
    		        return userRepository.save(newUser);
    		      });
    }
    
    public void deleteUser(Integer id) {
    	userRepository.deleteById(id);
    }
    


}
