package com.example.demo.controller;

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

import com.example.demo.entity.Account;
import com.example.demo.Service.AccountService;


@RestController
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	@GetMapping("/account")
	public Iterable<Account> getAccount(){
		return accountService.getAccount();
	}
	@PostMapping("/account")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void saveAccount(@RequestBody @Valid Account account) {
		accountService.saveAccount(account);
	}
	
	@DeleteMapping("/account/{id}")
	public void deleteAccount(@PathVariable("id") Integer id) {
		accountService.deleteAccount(id);
	}
}
