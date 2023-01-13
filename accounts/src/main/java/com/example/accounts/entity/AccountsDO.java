package com.example.accounts.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class AccountsDO {

	@Column(name = "customer_id")
	private Integer customerId;
	
	@Id
	@Column(name = "account_number")
	private Long accountNumber;
	
	@Column(name = "account_type")
	private String accountType;
	
	@Column(name = "branch_address")
	private String branchAddress;
	
	@Column(name = "created_at")
	private LocalDate createdAt;
}
