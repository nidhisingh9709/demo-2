package com.example.demo.Service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Account;
import com.example.demo.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	AccountRepository accountRepository;
	
	public Iterable<Account> getAccount() {
		// TODO Auto-generated method stub
		return accountRepository.findAll();
	}

	public void saveAccount(@Valid Account account) {
		// TODO Auto-generated method stub
		accountRepository.save(account);
	}

	public void deleteAccount(Integer id) {
		// TODO Auto-generated method stub
		accountRepository.deleteById(id);
	}

}
