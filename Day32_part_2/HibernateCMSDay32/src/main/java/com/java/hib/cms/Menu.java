package com.java.hib.cms;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Menu")
public class Menu {
	
	private int MEN_ID;
	private String MEN_ITEM;
	private double MEN_PRICE;
	private double MEN_CALORIES;
	private String MEN_SPECIALITY;
	
	@Id
	@Column(name="MEN_ID")
	public int getMEN_ID() {
		return MEN_ID;
	}
	public void setMEN_ID(int mEN_ID) {
		MEN_ID = mEN_ID;
	}
	@Column(name="MEN_ITEM")
	public String getMEN_ITEM() {
		return MEN_ITEM;
	}
	public void setMEN_ITEM(String mEN_ITEM) {
		MEN_ITEM = mEN_ITEM;
	}
	@Column(name="MEN_PRICE")
	public double getMEN_PRICE() {
		return MEN_PRICE;
	}
	public void setMEN_PRICE(double mEN_PRICE) {
		MEN_PRICE = mEN_PRICE;
	}
	@Column(name="MEN_CALORIES")
	public double getMEN_CALORIES() {
		return MEN_CALORIES;
	}
	public void setMEN_CALORIES(double mEN_CALORIES) {
		MEN_CALORIES = mEN_CALORIES;
	}
	@Column(name="MEN_SPECIALITY")
	public String getMEN_SPECIALITY() {
		return MEN_SPECIALITY;
	}
	public void setMEN_SPECIALITY(String mEN_SPECIALITY) {
		MEN_SPECIALITY = mEN_SPECIALITY;
	}

	
}
