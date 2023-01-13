package com.example.accounts.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.accounts.entity.AccountsDO;
import com.example.accounts.model.Accounts;
import com.example.accounts.model.Customer;
import com.example.accounts.service.AccountsService;
import com.example.accounts.service.Mapper;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class AccountsController {

	private final AccountsService accountsService;
	private final Mapper mapper;
	
	@PostMapping("/myAccount")
	public Accounts getAccountDetails(@RequestBody Customer customer) {
		
		AccountsDO accountsDO = accountsService.getAccountDetails(customer.getCustomerId());
		
		return mapper.toAccounts(accountsDO);
	}
}
