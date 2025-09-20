package com.mtd.ecommerce_app.entity;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mtd.ecommerce_app.dto.OrderItems;
import com.mtd.ecommerce_app.enums.OrderStatus;

@Document(collection = "orders")
public class Order {
	 	@Id
	    private String id;
	    private String userId;
	    private List<OrderItems> items;
	    private double totalAmount;
	    private OrderStatus status;   
	    private LocalDateTime createdAt;
	    
	    public Order() {}
		public Order(String userId, List<OrderItems> items, double totalAmount, OrderStatus status,
				LocalDateTime createdAt) {
			super();
			this.userId = userId;
			this.items = items;
			this.totalAmount = totalAmount;
			this.status = status;
			this.createdAt = createdAt;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public List<OrderItems> getItems() {
			return items;
		}
		public void setItems(List<OrderItems> items) {
			this.items = items;
		}
		public double getTotalAmount() {
			return totalAmount;
		}
		public void setTotalAmount(double totalAmount) {
			this.totalAmount = totalAmount;
		}
		public OrderStatus getStatus() {
			return status;
		}
		public void setStatus(OrderStatus status) {
			this.status = status;
		}
		public LocalDateTime getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(LocalDateTime createdAt) {
			this.createdAt = createdAt;
		}
	    
	    
}
