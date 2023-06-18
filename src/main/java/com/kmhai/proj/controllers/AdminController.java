package com.kmhai.proj.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kmhai.proj.services.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;
    
    @GetMapping
    public String test() {
        return "hello";
    }

    @GetMapping("/distributors")
    public ResponseEntity getAllDistributors() {
        return ResponseEntity.ok(adminService.geDistributors());
    }

    @GetMapping("/factories")
    public ResponseEntity getAllFactories() {
        return ResponseEntity.ok(adminService.getFactories());
    }

    @GetMapping("/service-centers")
    public ResponseEntity getAllServiceCenters() {
        return ResponseEntity.ok(adminService.getServiceCenters());
    }


}
