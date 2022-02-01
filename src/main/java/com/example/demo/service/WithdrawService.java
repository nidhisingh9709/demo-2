package com.example.demo.Service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Account;
import com.example.demo.entity.Withdraw;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.WithdrawRepository;

@Service
public class WithdrawService {

	@Autowired
	AccountRepository accountRepository;

	@Autowired
	WithdrawRepository withdrawRepository;

	public void addWithdraw(@Valid Withdraw withdraw, Integer id) {
		// TODO Auto-generated method stub

		Account account = accountRepository.findById(id).get();

		double initialAmount = account.getInitialDeposit();

			double finalAmount = initialAmount - withdraw.getAmount();
			account.setInitialDeposit(finalAmount);
			accountRepository.save(account);
			withdrawRepository.save(withdraw);
	
	}
}
