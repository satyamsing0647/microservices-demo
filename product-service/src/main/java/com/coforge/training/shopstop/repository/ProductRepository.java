package com.coforge.training.shopstop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coforge.training.shopstop.model.Product;

/*
* Date   : 29 Nov 2024
* Time   : 1:03:03 pm
* Author : Satyam.3.Singh 
* Project: product-service
*/

public interface ProductRepository extends JpaRepository<Product, Long> {

}
