package com.kmhai.proj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kmhai.proj.enitities.ServiceCenter;

public interface ServiceCenterRepo extends JpaRepository<ServiceCenter, Integer> {
    
}
