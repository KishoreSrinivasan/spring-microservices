package com.example.accounts.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Accounts {

	private Integer customerId;
	private Long accountNumber;
	private String accountType;
	private String branchAddress;
	private LocalDate createdAt;
}
