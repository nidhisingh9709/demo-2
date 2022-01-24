package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Customerdata;

@Repository
public interface CustomerRepository extends CrudRepository<Customerdata,Integer> {

}
