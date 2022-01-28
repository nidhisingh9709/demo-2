package com.example.demo.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.Service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/customer")
	Iterable<Customer> getcustomer() {
		return customerService.getCustomer();
	}

	@GetMapping("/customer/{id}")
	Optional<Customer> getCustomers(@PathVariable("id") Integer id) {
		return customerService.getCustomers(id);
	}

	@PostMapping("/customer")
	@ResponseStatus(code = HttpStatus.CREATED)
	void addCustomer(@RequestBody @Valid Customer customer) {
		customerService.addCustomer(customer);
			
	}
	@DeleteMapping("/customer/{id}")
	void deleteCustomer(@PathVariable("id") Integer id) {
		customerService.deleteCustomer(id);
	}
}
