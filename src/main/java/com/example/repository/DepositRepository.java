package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Deposit;

@Repository
public interface DepositRepository extends CrudRepository<Deposit, Integer> {

}
