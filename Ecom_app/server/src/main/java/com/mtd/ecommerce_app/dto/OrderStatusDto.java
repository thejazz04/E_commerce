package com.mtd.ecommerce_app.dto;

import com.mtd.ecommerce_app.enums.OrderStatus;

public class OrderStatusDto {
   private OrderStatus status;

   public OrderStatus getStatus() {
	return status;
   }

   public void setStatus(OrderStatus status) {
	this.status = status;
   }
   
}
