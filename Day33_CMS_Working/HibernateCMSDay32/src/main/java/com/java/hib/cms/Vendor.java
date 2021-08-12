package com.java.hib.cms;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Vendor")
public class Vendor {
	
	private int VEN_ID;
	private String VEN_NAME;
	private String VEN_PHN_NO;
	private String VEN_USERNAME;
	private String VEN_PASSWORD;
	private String VEN_EMAIL;
	
	@Id
	@Column(name="VEN_ID")
	public int getVEN_ID() {
		return VEN_ID;
	}
	public void setVEN_ID(int vEN_ID) {
		VEN_ID = vEN_ID;
	}
	@Column(name="VEN_NAME")
	public String getVEN_NAME() {
		return VEN_NAME;
	}
	public void setVEN_NAME(String vEN_NAME) {
		VEN_NAME = vEN_NAME;
	}
	@Column(name="VEN_PHN_NO")
	public String getVEN_PHN_NO() {
		return VEN_PHN_NO;
	}
	public void setVEN_PHN_NO(String vEN_PHN_NO) {
		VEN_PHN_NO = vEN_PHN_NO;
	}
	@Column(name="VEN_USERNAME")
	public String getVEN_USERNAME() {
		return VEN_USERNAME;
	}
	public void setVEN_USERNAME(String vEN_USERNAME) {
		VEN_USERNAME = vEN_USERNAME;
	}
	@Column(name="VEN_PASSWORD")
	public String getVEN_PASSWORD() {
		return VEN_PASSWORD;
	}
	public void setVEN_PASSWORD(String vEN_PASSWORD) {
		VEN_PASSWORD = vEN_PASSWORD;
	}
	@Column(name="VEN_EMAIL")
	public String getVEN_EMAIL() {
		return VEN_EMAIL;
	}
	public void setVEN_EMAIL(String vEN_EMAIL) {
		VEN_EMAIL = vEN_EMAIL;
	}
	
	

}
