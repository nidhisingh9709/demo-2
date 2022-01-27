package com.example.demo.Service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Deposit;
import com.example.demo.repository.DepositRepository;

@Service
public class DepositService {

	@Autowired
	DepositRepository depositRepository;
	public Iterable<Deposit> getDeposit() {
		// TODO Auto-generated method stub
		return depositRepository.findAll();
	}
	public Optional<Deposit> getDeposits(Integer id) {
		// TODO Auto-generated method stub
		return depositRepository.findById(id);
	}
	public void saveDeposit(@Valid Deposit deposit) {
		// TODO Auto-generated method stub
		depositRepository.save(deposit);
	}
	public void deleteDeposit(Integer id) {
		// TODO Auto-generated method stub
		depositRepository.deleteById(id);
	}

}
