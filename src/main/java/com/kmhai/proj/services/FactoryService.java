package com.kmhai.proj.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kmhai.proj.enitities.Factory;
import com.kmhai.proj.enitities.Product;
import com.kmhai.proj.exception.ResourceNotFoundException;
import com.kmhai.proj.repositories.FactoryRepo;
import com.kmhai.proj.repositories.ProductRepo;

@Service
public class FactoryService {
    
    @Autowired
    private FactoryRepo factoryRepo;

    @Autowired
    private ProductRepo productRepo;

    public Factory getFactoryById(int id) {
        return factoryRepo.findById(id)
                    .orElseThrow(() -> new ResourceNotFoundException("Factory not found"));
    }

    public void produce(Product product, int factory_id, int quantity) {
        
        Factory foundFactory = factoryRepo.findById(factory_id)
                                    .orElseThrow(() -> new ResourceNotFoundException("Factory not found"));
        
        for (int i = 0; i < quantity; i++) {
            Product newProduct = new Product(product.getName(), product.getReleaseDate(), product.getPrice(), foundFactory);
            productRepo.save(newProduct);
        }
    }
}
