package com.mtd.ecommerce_app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtd.ecommerce_app.entity.Product;
import com.mtd.ecommerce_app.repository.ProductRepository;

@Service
public class ProductService {
  
	 @Autowired
	 private ProductRepository productRepository;
	 
	 public Product saveProduct(Product product) {
		 product.setId(null);
		 return productRepository.save(product);
	 }
	 
	 public List<Product> getProduct(){
		 return productRepository.findAll();
	 }
	 
	 public Product getProductById(String id) {
		 return productRepository.findById(id).get();
	 }
	 
	 public Product updateProduct(String id,Product product) {
		 Product oldProduct = productRepository.findById(id)
		            .orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
		 if (product.getName() != null) {
		        oldProduct.setName(product.getName());
		    }
		    if (product.getDescription() != null) {
		        oldProduct.setDescription(product.getDescription());
		    }
		    if (product.getCategory() != null) {
		        oldProduct.setCategory(product.getCategory());
		    }
		    if (product.getStock() != 0) { 
		        oldProduct.setStock(product.getStock());
		    }
		    if (product.getPrice() != 0.0) {
		        oldProduct.setPrice(product.getPrice());
		    }
		    if (product.getImage() != null) {
		        oldProduct.setImage(product.getImage());
		    }
		    return productRepository.save(product);
	 }
	 
	 public boolean deleteProduct(String id) {
		 Optional<Product> optionalProduct = productRepository.findById(id);
		 if(optionalProduct.isEmpty()) {
			 return false;
		 }
		 productRepository.deleteById(id);
		 return true;
	 }
}
