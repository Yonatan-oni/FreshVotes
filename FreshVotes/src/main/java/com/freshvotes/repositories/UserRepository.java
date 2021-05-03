package com.freshvotes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freshvotes.domain.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUsername(String username);
	
} 
