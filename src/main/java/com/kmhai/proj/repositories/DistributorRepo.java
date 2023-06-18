package com.kmhai.proj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kmhai.proj.enitities.Distributor;

public interface DistributorRepo extends JpaRepository<Distributor, Integer> {
    
}
