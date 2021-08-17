package com.java.hib.cms;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Orders")
public class Orders {

	
	private int orderId;
	private int custId;
	private int vendorId;
	private String walSource;
	private int menuId;
	private int orderQuantity;
	private double billAmount;
	private OrderStatus orderStatus;
	private String orderComments;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ORD_ID")
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	@Column(name="CUS_ID")
	public int getCustId() {
		return custId;
	}
	
	public void setCustId(int custId) {
		this.custId = custId;
	}
	
	@Column(name="VEN_ID")
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	
	@Column(name="WAL_SOURCE")
	public String getWalSource() {
		return walSource;
	}
	public void setWalSource(String walSource) {
		this.walSource = walSource;
	}
	
	@Column(name="MEN_ID")
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	@Column(name="ORD_QUANTITY")
	public int getOrderQuantity() {
		return orderQuantity;
	}
	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}
	@Column(name="ORD_BILLAMOUNT")
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	@Column(name="ORD_STATUS")
	@Enumerated(EnumType.STRING)
	public OrderStatus getOrderStatus() {
		return orderStatus;
	}
	
	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	@Column(name="ORD_COMMENTS")
	public String getOrderComments() {
		return orderComments;
	}
	public void setOrderComments(String orderComments) {
		this.orderComments = orderComments;
	}
	
	
	
}
