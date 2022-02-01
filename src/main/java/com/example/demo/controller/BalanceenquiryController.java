package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.EnquiryService;

@RestController
public class BalanceenquiryController {

	@Autowired
	EnquiryService enquiryService;

	@GetMapping("/{id}/enquiry")
	public double getBalance(@PathVariable("id") Integer id) {
		return enquiryService.getBalance(id);
	}
}
