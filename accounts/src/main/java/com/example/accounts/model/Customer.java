package com.example.accounts.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {

	private Integer customerId;
	private String customerName;
	private String customerEmail;
	private Long mobileNumber;
	private LocalDate createdAt;
}
