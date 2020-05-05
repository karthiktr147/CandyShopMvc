package com.mindtree.candyshop.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class CandyDto {
	private int candyId;
	@NotNull(message = "candy name cannot be null")
	private String candyName;
	@Min(value = 1, message = "price cannot be less than 1 ruppees")
	private float price;
	@Min(value = 1, message = "stock cannot be less than 1 ")
	private int stock;

	public CandyDto() {

	}

	public CandyDto(int candyId, String candyName, float price, int stock) {
		super();
		this.candyId = candyId;
		this.candyName = candyName;
		this.price = price;
		this.stock = stock;
	}

	public int getCandyId() {
		return candyId;
	}

	public void setCandyId(int candyId) {
		this.candyId = candyId;
	}

	public String getCandyName() {
		return candyName;
	}

	public void setCandyName(String candyName) {
		this.candyName = candyName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}
