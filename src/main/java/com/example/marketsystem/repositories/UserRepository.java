package com.example.marketsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.marketsystem.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
