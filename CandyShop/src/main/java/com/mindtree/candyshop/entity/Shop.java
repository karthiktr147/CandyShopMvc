package com.mindtree.candyshop.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Table(name = "shop")
@Entity
public class Shop {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "shopid")
	private int shopId;
	@Column(name = "shopname")
	private String shopName;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
	@JsonProperty
	private List<Candy> candyList;

	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shop(int shopId, String shopName, List<Candy> candyList) {
		super();
		this.shopId = shopId;
		this.shopName = shopName;
		this.candyList = candyList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((candyList == null) ? 0 : candyList.hashCode());
		result = prime * result + shopId;
		result = prime * result + ((shopName == null) ? 0 : shopName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shop other = (Shop) obj;
		if (candyList == null) {
			if (other.candyList != null)
				return false;
		} else if (!candyList.equals(other.candyList))
			return false;
		if (shopId != other.shopId)
			return false;
		if (shopName == null) {
			if (other.shopName != null)
				return false;
		} else if (!shopName.equals(other.shopName))
			return false;
		return true;
	}

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public List<Candy> getCandyList() {
		return candyList;
	}

	public void setCandyList(List<Candy> candyList) {
		this.candyList = candyList;
	}

}
