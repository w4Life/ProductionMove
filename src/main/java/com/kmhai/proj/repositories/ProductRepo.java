package com.kmhai.proj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kmhai.proj.enitities.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {
    
}
