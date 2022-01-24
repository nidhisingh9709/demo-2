package com.example.controller;

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

import com.example.entity.Customerdata;
import com.example.entity.Deposit;
import com.example.service.ICustomerService;
import com.example.service.IDepositService;

@RestController
public class BankController {

	@Autowired
	ICustomerService customerService;
	IDepositService depositService;

	@GetMapping("/customer")
	Iterable<Customerdata> getcustomer() {
		return customerService.getCustomer();
	}

	@GetMapping("/customer/{id}")
	Optional<Customerdata> getCustomers(@PathVariable("id") Integer id) {
		return customerService.getCustomers(id);
	}

	// Get mapping for deposit class
	@GetMapping("/deposit")
	Iterable<Deposit> getDeposit() {
		return depositService.getDeposit();
	}

	@PostMapping("/customer")
	@ResponseStatus(code = HttpStatus.CREATED)
	void createCustomer(@RequestBody @Valid Customerdata customer) {
		customerService.saveCustomer(customer);
	}

	// Post mapping for deposit class
	@PostMapping("/deposit")
	@ResponseStatus(code = HttpStatus.CREATED)
	void createDeposit(@RequestBody @Valid Deposit deposit) {
		customerService.saveDeposit(deposit);
	}

	@DeleteMapping("/customer/{id}")
	void deleteCustomer(@PathVariable("id") Integer id) {
		customerService.deleteCustomer(id);
	}
	
	@DeleteMapping("/deposit/{id}")
	void deleteDeposit(@PathVariable("id") Integer id) {
		customerService.deleteDeposit(id);
	}
}