package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Account;
import com.example.demo.repository.AccountRepository;

@Service
public class EnquiryService {

	@Autowired
	AccountRepository accountRepository;

	public double getBalance(Integer id) {
		// TODO Auto-generated method stub

		Account account = accountRepository.findById(id).get();
		Integer amount = (int) account.getInitialDeposit();

		return amount;
	}

}
