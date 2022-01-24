package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Deposit;
import com.example.repository.DepositRepository;

@Service
public class IDepositService {
	
@Autowired
DepositRepository depositRepository;

public void saveDeposit(Deposit deposit) {
	depositRepository.save(deposit);
}

public Iterable<Deposit> getDeposit() {
	// TODO Auto-generated method stub
	return depositRepository.findAll();
}

public Optional<Deposit> getCustomers(Integer id) {
	return depositRepository.findById(id);
}

public void deleteDeposit(Integer id) {
	// TODO Auto-generated method stub
	depositRepository.deleteById(id);
}
}
