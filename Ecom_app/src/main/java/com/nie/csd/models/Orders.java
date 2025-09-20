package com.nie.csd.models;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;

import com.nie.csd.enums.OrderStatus;

public class Orders {
        @Id
	    private String id;
	    //private String userId;
	    private List<Products> products;
	    private double totalAmount;
	    private OrderStatus status;   
	    private LocalDateTime createdAt;
	    
	    public Orders() {}
		public Orders(String userId, List<Products> products, double totalAmount, OrderStatus status,
				LocalDateTime createdAt) {
			super();
			//this.userId = userId;
			this.products = products;
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
		// public String getUserId() {
		// 	return userId;
		// }
		// public void setUserId(String userId) {
		// 	this.userId = userId;
		// }
		public List<Products> getProducts() {
			return products;
		}
		public void setItems(List<Products> products) {
			this.products = products;
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
