package com.example.marketsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.marketsystem.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
