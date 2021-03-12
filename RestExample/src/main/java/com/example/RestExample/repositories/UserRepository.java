package com.example.RestExample.repositories;


import org.springframework.data.repository.CrudRepository;

import com.example.RestExample.entities.User;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {

    public User findByName(String name);
}