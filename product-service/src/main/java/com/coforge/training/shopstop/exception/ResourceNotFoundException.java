package com.coforge.training.shopstop.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/*
* Date   : 29 Nov 2024
* Time   : 1:07:33 pm
* Author : Satyam.3.Singh 
* Project: product-service
*/

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(String message) {
		super(message);
		
	}
	

}
