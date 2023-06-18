package com.kmhai.proj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kmhai.proj.enitities.Factory;

public interface FactoryRepo extends JpaRepository<Factory, Integer> {
    
}
