package com.kmhai.proj.enitities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "factories")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Factory {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String address;

    private String email;

    @OneToMany(mappedBy = "factory", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Product> products;

}
