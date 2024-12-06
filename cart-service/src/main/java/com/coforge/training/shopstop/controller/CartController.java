package com.coforge.training.shopstop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* Date   : 28 Nov 2024
* Time   : 5:16:53 pm
* Author : Satyam.3.Singh 
* Project: cart-service
*/

@RestController
@RequestMapping("/cart")
public class CartController {
	
	@GetMapping("/getCartData")
	public String helloWorld() {
		return "HelloWorld from Cart - Microservices";
	}
}
