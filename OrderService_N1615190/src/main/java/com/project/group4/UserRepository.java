package com.project.group4;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.group4.User;

public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);
} 