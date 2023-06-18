package com.kmhai.proj.enitities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    private String name;

    @NonNull
    private LocalDate releaseDate;

    @NonNull
    private int price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "factory_id")
    @NonNull
    private Factory factory;

    
}
