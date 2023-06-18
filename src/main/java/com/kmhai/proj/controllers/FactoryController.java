package com.kmhai.proj.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kmhai.proj.enitities.Product;
import com.kmhai.proj.services.FactoryService;

@RestController
@RequestMapping("/factory")
public class FactoryController {

    @Autowired
    private FactoryService factoryService;
    
    @GetMapping("/{id}")
    public ResponseEntity getFactoryById(@PathVariable int id) {
        return ResponseEntity.ok(factoryService.getFactoryById(id));
    }

    @PostMapping("/{id}/new")
    public ResponseEntity produceProduct(@RequestBody Product product, @PathVariable Integer id, @RequestParam int quantity) {
        factoryService.produce(product, id, quantity);
        return ResponseEntity.ok("Success");
    }
}
