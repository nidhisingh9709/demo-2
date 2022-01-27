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

import com.example.entity.Deposit;
import com.example.service.DepositService;

@RestController
	public class DepositController {
		@Autowired
		DepositService depositService;
		
		@GetMapping("/deposit")
		Iterable<Deposit> getDeposit(){
			return depositService.getDeposit();
			
		}
		@GetMapping("/deposit/{id}")
		Optional<Deposit> getCustomers(@PathVariable("id") Integer id) {
			return depositService.getDeposits(id);
		}
		
		@PostMapping("/deposit")
		@ResponseStatus(code = HttpStatus.CREATED)
		void addDeposit(@RequestBody @Valid Deposit deposit) {
			depositService.saveDeposit(deposit);
		}
		@DeleteMapping("/deposit/{id}")
		void deleteDeposit(@PathVariable("id") Integer id) {
			depositService.deleteDeposit(id);
		}

}
