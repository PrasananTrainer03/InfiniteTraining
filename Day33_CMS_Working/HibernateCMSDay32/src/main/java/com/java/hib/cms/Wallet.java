package com.java.hib.cms;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Wallet")
public class Wallet {
	
	private int CUS_ID;
	private int WAL_ID;
	private Double WAL_AMOUNT;
	private String WAL_SOURCE;
	
	
	@Column(name="CUS_ID")
	public int getCUS_ID() {
		return CUS_ID;
	}
	public void setCUS_ID(int cUS_ID) {
		CUS_ID = cUS_ID;
	}
	
	@Id
	@Column(name="WAL_ID")
	public int getWAL_ID() {
		return WAL_ID;
	}
	public void setWAL_ID(int wAL_ID) {
		WAL_ID = wAL_ID;
	}
	@Column(name="WAL_AMOUNT")
	public Double getWAL_AMOUNT() {
		return WAL_AMOUNT;
	}
	public void setWAL_AMOUNT(Double wAL_AMOUNT) {
		WAL_AMOUNT = wAL_AMOUNT;
	}
	@Column(name="WAL_SOURCE")
	public String getWAL_SOURCE() {
		return WAL_SOURCE;
	}
	public void setWAL_SOURCE(String wAL_SOURCE) {
		WAL_SOURCE = wAL_SOURCE;
	}
	
	

}
