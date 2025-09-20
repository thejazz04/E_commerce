package com.mtd.ecommerce_app.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.mtd.ecommerce_app.enums.Category;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Document(collection = "products")
public class Product {
    @Id	
    private String id;
    private String name;
    private String description;
    @NotNull(message = "Category is required")
    private Category category;
    private List<String> tags;
    private float price;
    @Min(value = 51, message = "Stock must be greater than 50")
    private int stock;
    private String image;
    
    public Product() {}
	public Product(String name, String description, Category category, List<String> tags, float price, int stock,String image) {
		super();
		this.name = name;
		this.description = description;
		this.category = category;
		this.tags = tags;
		this.price = price;
		this.stock = stock;
		this.image = image;
	}
	

	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}  

    
}
