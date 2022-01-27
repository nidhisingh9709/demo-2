package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
    @NotBlank
    @Size(max=10)
	@Column(name="Customer_id")
    private long customerId;
    
    
    AccountType account; //created a reference for Enum AccountType
    private String accountType;
	
    @NotBlank
	@DecimalMin(value="1.0")
    @Digits(integer=10, fraction=2)
    @Pattern(regexp="[0-9}+")
	private long InitialDeposit;
    
    @OneToOne(mappedBy="account")
    Customer customer;
	
	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public long getInitialDeposit() {
		return InitialDeposit;
	}

	public void setInitialDeposit(long initialDeposit) {
		InitialDeposit = initialDeposit;
	}

	
	
	
	
	
	
	
}
