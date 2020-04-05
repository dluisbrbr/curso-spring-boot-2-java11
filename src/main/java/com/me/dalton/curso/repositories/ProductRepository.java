package com.me.dalton.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.me.dalton.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
