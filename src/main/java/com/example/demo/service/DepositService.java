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
	
	public void saveDeposit(@Valid Deposit deposit) {
		// TODO Auto-generated method stub
		Integer accId= deposit.getAccount_Number();
		Account account= accountRepository.findById(accId).get();
		
		Integer initialAmount= (int) account.getInitialDeposit();
		Integer finalAmount= deposit.getAmount()+initialAmount;
		
		account.setInitialDeposit(finalAmount);
		accountRepository.save(account);
		depositRepository.save(deposit);
	}

}
