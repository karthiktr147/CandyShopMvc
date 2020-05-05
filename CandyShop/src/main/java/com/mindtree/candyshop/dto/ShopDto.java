package com.mindtree.candyshop.dto;

import java.util.List;

import javax.validation.constraints.NotNull;

public class ShopDto {


	@NotNull(message = "shop name cannot be null")
	private String shopName;
	private List<CandyDto> candyList;

	public ShopDto() {

	}

	public ShopDto(int shopId, String shopName, List<CandyDto> candyList) {
		super();
	
		this.shopName = shopName;
		this.candyList = candyList;
	}

	

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public List<CandyDto> getCandyList() {
		return candyList;
	}

	public void setCandyList(List<CandyDto> candyList) {
		this.candyList = candyList;
	}

}
