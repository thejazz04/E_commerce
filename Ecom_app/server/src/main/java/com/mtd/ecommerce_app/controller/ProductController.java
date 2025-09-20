package com.mtd.ecommerce_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.mtd.ecommerce_app.entity.Product;
import com.mtd.ecommerce_app.service.ProductService;

@RestController
@RequestMapping("/products")
@CrossOrigin("*")
public class ProductController {
	@Autowired
    private ProductService productService;
	
	
	@PostMapping("/add")
	public Product create(@RequestBody Product product) {
		return productService.saveProduct(product);
	}
	
	@GetMapping("/all")
	public List<Product> findAll() {
		return productService.getProduct();
	}
	
	@GetMapping("/product/{id}")
	public Product findBuId(@PathVariable String id) {
		return productService.getProductById(id);
	}
	
	@PutMapping("/edit/{id}")
	public Product update(@RequestBody Product product, @PathVariable String id) {
		return productService.updateProduct(id, product);
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable String id) {
		return productService.deleteProduct(id); 
	}
	
}
