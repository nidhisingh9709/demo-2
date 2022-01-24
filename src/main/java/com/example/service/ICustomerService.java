package com.example.service;

import com.example.entity.Customerdata;
import com.example.entity.Deposit;
import com.example.repository.CustomerRepository;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ICustomerService {

	@Autowired
	CustomerRepository customerRepository;

	public void saveCustomer(Customerdata customer) {
		customerRepository.save(customer);
	}

	public Iterable<Customerdata> getCustomer() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	public Optional<Customerdata> getCustomers(Integer id) {
		return customerRepository.findById(id);
	}

	public void deleteCustomer(Integer id) {
		// TODO Auto-generated method stub
		customerRepository.deleteById(id);
	}

	public void saveDeposit(@Valid Deposit deposit) {
		// TODO Auto-generated method stub
		
	}

	public void deleteDeposit(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
