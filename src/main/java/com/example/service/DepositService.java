
package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Deposit;
import com.example.repository.DepositRepository;

@Service
public class DepositService {

	@Autowired
	private DepositRepository depositRepository;
	
	public Iterable<Deposit> getDeposit() {
		return depositRepository.findAll();
	}
	
	public void saveDeposit(Deposit deposit) {
		depositRepository.save(deposit);
	}

	public Optional<Deposit> getDeposits(Integer id) {
		// TODO Auto-generated method stub
		return depositRepository.findById(id);
	}

	public void deleteDeposit(Integer id) {
		// TODO Auto-generated method stub
		depositRepository.deleteById(id);
	}
	
}