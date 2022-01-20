package com.example.entity;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Customerdata {
	@NotBlank
	@Size(max=25)
	private String Customer;
	
	@NotBlank
	private String Gender;
	
	@NotBlank
	@DateTimeFormat(pattern= "DD-MON-YY")
	private Date DOB;
	
    @Size(max=15)
	private String Telephone_no;
    
    @NotBlank
    @Size(max=50)
	private String address;
	
	@NotBlank
	@Size(max=25)
	private String city;
	
	@NotBlank
	@Size(max=25)
	private String State;
	
    @Size(max=7)
	private int pin;
	private String Fax;
	
	@NotBlank
	@Size(max=30)
	@Pattern(regexp="^[0-9 a-z A-Z ]+ @[0-9 a-z A-Z .-]+$")
	private String email;

	public String getCustomer() {
		return Customer;
	}

	public void setCustomer(String customer) {
		Customer = customer;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public String getTelephone_no() {
		return Telephone_no;
	}

	public void setTelephone_no(String telephone_no) {
		Telephone_no = telephone_no;
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

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFax() {
		return Fax;
	}

	public void setFax(String fax) {
		Fax = fax;
	}
	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}
	
	
	
	

}
