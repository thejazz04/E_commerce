package com.nie.csd.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nie.csd.models.Products;
import com.nie.csd.services.ProductService;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public List<Products> getAllProducts() {
        return service.getAllProducts();
    }
}
