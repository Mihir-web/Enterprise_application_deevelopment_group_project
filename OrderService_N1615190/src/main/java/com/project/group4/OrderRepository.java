package com.project.group4;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.group4.Order;

public interface OrderRepository extends MongoRepository<Order, String> {
    List<Order> findByUserId(String userId);
    List<Order> findByUserIdAndStatus(String userId, String status);
} 