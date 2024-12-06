package com.coforge.training.shopstop.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.coforge.training.shopstop.model.Product;

/*
* Date   : 29 Nov 2024
* Time   : 3:21:40 pm
* Author : Satyam.3.Singh 
* Project: order-service
*/

@FeignClient(name = "product-service")
public interface ProductClient {

		/*
		 * When integrating with external APIs using Spring Boot, a popular choice is the Feign client.
		 *  Feign is a declarative web service client that simplifies the process of making HTTP 
		 *  requests. With Spring Boot, you can easily create a Feign client by annotating an 
		 *  interface with the @ FeignClient annotation. This annotation specifies the API 
		 *  endpoint's base URL and other settings. Feign automatically generates the client 
		 *  code for making requests, making it a convenient and efficient way to 
		 *  consume web services.
		 */
		
		//Declare a method to be called from product-service using FeignClient
		@GetMapping("api/products/{pid}")
		public ResponseEntity<Product> getProductById(@PathVariable(value="pid") Long pId);
		
		//Get product details from another ms
		@GetMapping("api/products")
		public ResponseEntity<List<Product>> getAllProducts();
}
