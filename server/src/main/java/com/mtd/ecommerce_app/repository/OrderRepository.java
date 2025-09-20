package com.mtd.ecommerce_app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mtd.ecommerce_app.entity.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, String> {

}
