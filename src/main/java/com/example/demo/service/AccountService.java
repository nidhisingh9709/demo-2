package com.example.demo.Service;

import java.util.Optional;

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

	public Optional<Account> getAccount(Integer id) {
		// TODO Auto-generated method stub
		return accountRepository.findById(id);
	}

	public void saveAccount(@Valid Account account) {
		// TODO Auto-generated method stub

		Integer customer_id = Integer.parseInt(account.getCustomerId());
		Customer customer = customerRepository.findById(customer_id).get();

		customer.setAccount(account);
		accountRepository.save(account);
		customerRepository.save(customer);

	}

}
