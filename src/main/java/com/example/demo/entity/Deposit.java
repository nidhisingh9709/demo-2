package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.validator.constraints.Range;

@Entity
@Table(name = "deposits")
public class Deposit {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@NotNull
	@NotBlank
	@Size(max = 10)
	@Pattern(regexp = "^[0-9]*$")
	private String accNumber;
	@NotNull
	@Range(min = 0)
	private Double amount;
	private String description;

	@ManyToOne(fetch = FetchType.LAZY)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "account_id", referencedColumnName = "id")
	private Account account;

	public Deposit() {

	}

	public Deposit(Integer id, @NotNull @Size(max = 10) @Pattern(regexp = "^[1-9]+[0-9]*$") String accNumber,
			@NotNull @Range(min = 0) Double amount, String description) {
		super();
		this.id = id;
		this.accNumber = accNumber;
		this.amount = amount;
		this.description = description;

	}

	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
