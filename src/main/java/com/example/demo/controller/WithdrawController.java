package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.WithdrawService;
import com.example.demo.entity.Withdraw;

@RestController
public class WithdrawController {
	
	@Autowired
	WithdrawService withdrawService;

	@PostMapping("/{id}/withdraw")
	public void addWithdraw(@RequestBody @Valid Withdraw withdraw, @PathVariable("id") Integer id) {
		withdrawService.addWithdraw(withdraw,id);
	}
}
