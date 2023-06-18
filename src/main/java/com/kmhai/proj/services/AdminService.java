package com.kmhai.proj.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kmhai.proj.enitities.Distributor;
import com.kmhai.proj.enitities.Factory;
import com.kmhai.proj.enitities.ServiceCenter;
import com.kmhai.proj.repositories.DistributorRepo;
import com.kmhai.proj.repositories.FactoryRepo;
import com.kmhai.proj.repositories.ServiceCenterRepo;

@Service
public class AdminService {
    
    @Autowired
    private DistributorRepo distributorRepo;

    @Autowired
    private FactoryRepo factoryRepo;

    @Autowired
    private ServiceCenterRepo serviceCenterRepo;

    public List<Distributor> geDistributors() {
        return distributorRepo.findAll();
    }

    public List<Factory> getFactories() {
        return factoryRepo.findAll();
    }

    public List<ServiceCenter> getServiceCenters() {
        return serviceCenterRepo.findAll();
    } 
}
