package com.nie.csd.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nie.csd.models.Products;
import com.nie.csd.repositories.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Products> getAllProducts() {
        return repository.findAll();
    }
}