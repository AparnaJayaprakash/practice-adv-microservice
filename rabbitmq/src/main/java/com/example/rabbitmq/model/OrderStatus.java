package com.example.rabbitmq.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderStatus {
	
	PurchaseOrder purchaseorder;
	private String orderStatus;
	private String message;

}
