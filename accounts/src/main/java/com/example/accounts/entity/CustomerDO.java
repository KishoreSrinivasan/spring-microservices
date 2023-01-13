package com.example.accounts.entity;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@Entity
public class CustomerDO {

//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name = "customer_id")
	private Integer customerId;
	
//	@Column(name = "customer_name")
	private String customerName;
	
//	@Column(name = "customer_email")
	private String customerEmail;
	
//	@Column(name = "mobile_number")
	private Long mobileNumber;
	
//	@Column(name = "created_at")
	private LocalDate createdAt;
}
