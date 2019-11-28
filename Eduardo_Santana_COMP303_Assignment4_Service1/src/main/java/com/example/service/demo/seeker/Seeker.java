/**
 * 
 */
package com.example.service.demo.seeker;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

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
	
	@NotBlank(message = "AgeOrDOB is mandatory")
	@NotNull()
	@Column(name="ageOrDOB")
	private String ageOrDOB ;
	
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
	
	@NotBlank(message = "Phone is mandatory")
	@NotNull()
	@Column(name="phone")
	private String phone ;
	
	//examples for more annotations
	//@Size(min=20, max=60)private intage;
	//@Pattern(regex="[0-9]+")
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
			String ageOrDOB, 
			String gender, 
			String bloodGroup, 
			String city,
			String phone) 
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.ageOrDOB = ageOrDOB;
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
	 * @return the ageOrDOB
	 */
	public String getAgeOrDOB() {
		return ageOrDOB;
	}
	/**
	 * @param ageOrDOB the ageOrDOB to set
	 */
	public void setAgeOrDOB(String ageOrDOB) {
		this.ageOrDOB = ageOrDOB;
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