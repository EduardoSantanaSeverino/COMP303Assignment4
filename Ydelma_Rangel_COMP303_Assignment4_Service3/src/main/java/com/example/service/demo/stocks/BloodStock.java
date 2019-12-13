/**
 * 
 */
package com.example.service.demo.stocks;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="stock")
public class BloodStock {
	
	@Id
	@Column(name="stockId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stockId;
	
	@Column(name="bloodGroup")
	@NotEmpty
	private String bloodGroup;
	
	@Column(name="quantity")
	@NotNull 
	@Min(1) 
	@Max(120)
	private int quantity;
	
	@NotEmpty
	@Column(name="bestBefore")
	private String bestBefore;
	
	@Column(name="status")
	@NotEmpty
	private String status;
	
	// Define Constructor 
	public BloodStock() {}
	
	// Define Constructor with parameters
	public BloodStock(int stockId, String bloodGroup, int quantity, String bestBefore, String status) {
		super();
		this.stockId = stockId;
		this.bloodGroup = bloodGroup;
		this.quantity = quantity;
		this.bestBefore = bestBefore;
		this.status = status;
	}

	// Getting and setting methods
	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBestBefore() {
		return bestBefore;
	}

	public void setBestBefore(String bestBefore) {
		this.bestBefore = bestBefore;
	}	

}