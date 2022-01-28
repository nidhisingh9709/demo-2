package com.example.demo.Service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Account;
import com.example.demo.entity.Customer;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.CustomerRepository;

@Service
public class AccountService {

	@Autowired
	AccountRepository accountRepository;
	
	@Autowired
	CustomerRepository customerRepository;
	
	public Iterable<Account> getAccount() {
		// TODO Auto-generated method stub
		return accountRepository.findAll();
	}

	public void saveAccount(@Valid Account account,Integer id) {
		// TODO Auto-generated method stub
		Customer customer= customerRepository.findById(id).get();
		Account account1 = customer.getAccount();
		
		accountRepository.save(account1);
		customerRepository.save(customer);
	}



}
