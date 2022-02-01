package com.example.demo.Service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Account;
import com.example.demo.entity.Deposit;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.DepositRepository;

@Service
public class DepositService {

	@Autowired
	DepositRepository depositRepository;
	
	@Autowired
	AccountRepository accountRepository;
	
	public void saveDeposit(@Valid Deposit deposit,Integer id) {
		// TODO Auto-generated method stub
		Account account= accountRepository.findById(id).get();
		
		double initialAmount= account.getInitialDeposit();
		double finalAmount= deposit.getAmount()+initialAmount;
		
		account.setInitialDeposit(finalAmount);
		accountRepository.save(account);
		depositRepository.save(deposit);
	}

}
