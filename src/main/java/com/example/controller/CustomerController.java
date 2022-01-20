package com.example.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.entity.Customerdata;

@RestController
public class CustomerController {
	
	@PostMapping("/Customerdata"){
		System.out.println("Customer data validation");
	}

}
