package com.example.web.demo.bloodbank;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import com.sun.istack.NotNull;

/**
 * Student Name: Andrea de la Isla Portilla
 * Student Number: 301039987
 * Submission Date: 2019-11-15 (Estimated)
 * File Created: Nov. 6, 2019
 */

@Entity
@Table(name="bloodbank")
public class BloodBank {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank(message = "Blood Bank Name is mandatory")
	@NotNull()
	@Column(name="bloodBankName")
	private String bloodBankName;
	
	@NotBlank(message = "Address is mandatory")
	@NotNull()
	@Column(name="address")
	private String address;
	
	@NotBlank(message = "City is mandatory")
	@NotNull()
	@Column(name="city")
	private String city;
	
	@Pattern(regexp="[0-9]{3}-[0-9]{3}-[0-9]{4}")
	@NotBlank(message = "Phone is mandatory")
	@Column(name="phone")
	private String phone;
	
	@NotBlank(message = "Website is mandatory")
	@NotNull()
	@Column(name="website")
	private String website;
	
	@NotBlank(message = "Email is mandatory")
	@NotNull()
	@Email(message = "this is not a valid email")
	@Column(name="email")
	private String email;
	
	public BloodBank(String bloodBankName, String address, String city, String phone, String website, String email) {
		super();
		this.bloodBankName = bloodBankName;
		this.address = address;
		this.city = city;
		this.phone = phone;
		this.website = website;
		this.email = email;
	}
	
	public BloodBank() {	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getBloodBankName() {
		return bloodBankName;
	}

	public void setBloodBankName(String bloodBankName) {
		this.bloodBankName = bloodBankName;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
