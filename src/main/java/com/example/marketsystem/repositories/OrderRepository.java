package com.example.marketsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.marketsystem.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
