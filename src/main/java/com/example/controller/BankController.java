package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Customerdata;

@RestController
public class BankController {

	@PostMapping("/customerdata")
	@ResponseStatus(code = HttpStatus.CREATED)
	void createCustomer(@RequestBody Customerdata customer) {
		System.out.println(customer.getCustomer());
	}
}