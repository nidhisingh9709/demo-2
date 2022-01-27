
package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Account;
import com.example.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	AccountRepository accountRepository;
	
	public Iterable<Account> getAccount() {
		// TODO Auto-generated method stub
		return accountRepository.findAll();
	}

	public void saveAccount(Account account) {
		// TODO Auto-generated method stub
		accountRepository.save(account);
	}

	public void deleteAccount(Integer id) {
		// TODO Auto-generated method stub
		accountRepository.deleteById(id);
	}

}
