package com.example.accounts.entity;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@Entity
public class AccountsDO {

//	@Column(name = "customer_id")
	private Integer customerId;
	
//	@Id
//	@Column(name = "account_number")
	private Long accountNumber;
	
//	@Column(name = "account_type")
	private String accountType;
	
//	@Column(name = "branch_address")
	private String branchAddress;
	
//	@Column(name = "created_at")
	private LocalDate createdAt;
}
