package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;



@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer customerid;

	// Customer Name
	@NotBlank
	@Size(max = 25)
	@Pattern(regexp = "^[a-z A-Z]+$")
	private String name;

	// Gender
	@NotBlank
	@Pattern(regexp = "^M(ale)?$|^F(emale)?$")
	private String gender;

	// Date of birth
	@NotBlank
    @DateTimeFormat(pattern="dd/mm/yyyy")
	private String dob;

	// Address
	@NotBlank
	@Size(max = 50)
	private String address;

	// City
	@NotBlank
	
	@Size(max = 25)
	@Pattern(regexp = "^[a-z A-Z]+$")
	private String city;

	// State
	@NotBlank
	@Size(max = 25)
	@Pattern(regexp = "^[a-z A-Z]+$")
	private String state;

	// ZIP/PIN
	@NotBlank
	@Pattern(regexp = "[0-9 ]+")
	@Size(max = 7)
	private String pin;

	// Telephone
	@Pattern(regexp = "[0-9 ]+")
	@Size(max = 15)
	private String telephoneNo;

	// FAX
	@Size(max = 15)
	@Pattern(regexp = "[0-9 ]+")
	private String fax;

	// Email
	@Email
	@NotBlank
	@Size(max = 30)
	@Pattern(regexp = "^[0-9 a-z A-Z ]+ @[0-9 a-z A-Z .-]+$")
	private String email;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "deposit_id", referencedColumnName = "id")
     private Deposit deposit;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "account_id", referencedColumnName = "id")
	private Account account;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Customer() {

	}

	public Integer getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	

	public String getTelephoneNo() {
		return telephoneNo;
	}

	public void setTelephoneNo(String telephoneNo) {
		this.telephoneNo = telephoneNo;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
