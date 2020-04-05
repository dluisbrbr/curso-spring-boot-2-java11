package com.me.dalton.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.me.dalton.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
