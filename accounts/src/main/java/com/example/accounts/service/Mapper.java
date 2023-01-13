package com.example.accounts.service;

import com.example.accounts.entity.AccountsDO;
import com.example.accounts.model.Accounts;

@org.mapstruct.Mapper
public interface Mapper {
 
	public abstract Accounts toAccounts(AccountsDO accountsDO);
}
