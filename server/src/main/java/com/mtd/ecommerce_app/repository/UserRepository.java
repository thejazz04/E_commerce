package com.mtd.ecommerce_app.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mtd.ecommerce_app.entity.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	Optional<User> findByEmail(String email);
	
}
