package com.example.marketsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.marketsystem.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
