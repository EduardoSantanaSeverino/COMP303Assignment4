package com.example.web.demo.seeker;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import com.sun.istack.NotNull;

/**
 * Student Name: Eduardo Santana
 * Student Number: 301048660
 * Submission Date: 2019-11-15 (Estimated)
 * File Created: Nov. 6, 2019
 */

@Entity
@Table(name="seekers")
public class Seeker {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank(message = "FirstName is mandatory")
	@NotNull()
	@Column(name="firstName")
	private String firstName;
	
	@NotBlank(message = "LastName is mandatory")
	@NotNull()
	@Column(name="lastName")
	private String lastName ;
	
	@NotNull()
	@Range(min = 18, max = 99, message = "Can only be from 18 to 99")
	@Column(name="age")
	private int age ;
	
	@NotBlank(message = "Gender is mandatory")
	@NotNull()
	@Column(name="gender")
	private String gender ;
	
	@NotBlank(message = "BloodGroup is mandatory")
	@NotNull()
	@Column(name="bloodGroup")
	private String bloodGroup ;
	
	@NotBlank(message = "City is mandatory")
	@NotNull()
	@Column(name="city")
	private String city ;
	
	@NotBlank(message = "phone is mandatory")
	@NotNull()
	@Column(name="phone")
	@Pattern(regexp="^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$", message = "Should be in the format 999-999-9999")
	private String phone ;
	
	/**
	 * Default constructor
	 */
	public Seeker() {
		super();
	} 
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param ageOrDOB
	 * @param gender
	 * @param bloodGroup
	 * @param city
	 * @param phone
	 */
	public Seeker(
			String firstName, 
			String lastName, 
			int age, 
			String gender, 
			String bloodGroup, 
			String city,
			String phone) 
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.bloodGroup = bloodGroup;
		this.city = city;
		this.phone = phone;
		this.id = 0;
	} 
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the bloodGroup
	 */
	public String getBloodGroup() {
		return bloodGroup;
	}
	/**
	 * @param bloodGroup the bloodGroup to set
	 */
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

}