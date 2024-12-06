package com.coforge.training.shopstop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/*
* Date   : 29 Nov 2024
* Time   : 1:01:25 pm
* Author : Satyam.3.Singh 
* Project: product-service
*/

@Entity
@Setter
@Getter
public class Product {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;
    private String description;
    
    
}
