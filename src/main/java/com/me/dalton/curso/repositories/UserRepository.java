package com.me.dalton.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.me.dalton.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
