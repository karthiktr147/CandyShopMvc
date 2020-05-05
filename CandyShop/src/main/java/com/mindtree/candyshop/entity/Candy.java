package com.mindtree.candyshop.entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "candy")
public class Candy implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6567297796050176021L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "candyid",nullable = false)
	private int candyId;
	@Column(name = "candyname", nullable = false,unique = true)
	private String candyName;
	@Column(name = "candyprice")
	private float price;
	@Column(name = "candystock")
	private int stock;

	@ManyToOne
	private Shop shop;

	public Candy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Candy(int candyId, String candyName, float price, int stock, Shop shop) {
		super();
		this.candyId = candyId;
		this.candyName = candyName;
		this.price = price;
		this.stock = stock;
		this.shop = shop;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + candyId;
		result = prime * result + ((candyName == null) ? 0 : candyName.hashCode());
		result = prime * result + Float.floatToIntBits(price);
		result = prime * result + ((shop == null) ? 0 : shop.hashCode());
		result = prime * result + stock;
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
		Candy other = (Candy) obj;
		if (candyId != other.candyId)
			return false;
		if (candyName == null) {
			if (other.candyName != null)
				return false;
		} else if (!candyName.equals(other.candyName))
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		if (shop == null) {
			if (other.shop != null)
				return false;
		} else if (!shop.equals(other.shop))
			return false;
		if (stock != other.stock)
			return false;
		return true;
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

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}
	
}
