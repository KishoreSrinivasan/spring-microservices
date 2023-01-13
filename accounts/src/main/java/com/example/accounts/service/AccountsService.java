package com.example.accounts.service;

import org.springframework.stereotype.Service;

import com.example.accounts.entity.AccountsDO;
import com.example.accounts.repository.AccountsRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AccountsService {

	private final AccountsRepository accountRepository;
	
	public AccountsDO getAccountDetails(int customerId) {

		return accountRepository.findByCustomerId(customerId).orElseThrow(
				() -> new AccountsServiceException("Account details not found for the given " + customerId));
	}
	
	private static class AccountsServiceException extends RuntimeException {

		public AccountsServiceException(String s) {

			super(s);
		}

		public AccountsServiceException(String s, Throwable throwable) {

			super(s, throwable);
		}
	}
}
