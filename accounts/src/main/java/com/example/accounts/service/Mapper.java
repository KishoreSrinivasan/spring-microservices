package com.example.accounts.service;

import org.mapstruct.Mapping;

import com.example.accounts.entity.AccountsDO;
import com.example.accounts.model.Accounts;

@org.mapstruct.Mapper
public interface Mapper {
 
	@Mapping(target = "customerId", source = "customerId")
	@Mapping(target = "accountNumber", source = "accountNumber")
	@Mapping(target = "accountType", source = "accountType")
	@Mapping(target = "branchAddress", source = "branchAddress")
	@Mapping(target = "createdAt", source = "createdAt")
	public abstract Accounts toAccounts(AccountsDO accountsDO);
}
