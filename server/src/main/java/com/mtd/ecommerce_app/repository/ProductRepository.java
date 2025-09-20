package com.mtd.ecommerce_app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mtd.ecommerce_app.entity.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

}
