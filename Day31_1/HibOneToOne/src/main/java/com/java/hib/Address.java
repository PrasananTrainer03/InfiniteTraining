package com.java.hib;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity  
@Table(name="address221")  
public class Address {    
      
    @Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  
private int addressId;    
private String addressLine1,city,state,country;    
private int pincode;    
  
@OneToOne(targetEntity=Employee.class)  
private Employee employee;  
public int getAddressId() {  
    return addressId;  
}  
public void setAddressId(int addressId) {  
    this.addressId = addressId;  
}  
public String getAddressLine1() {  
    return addressLine1;  
}  
public void setAddressLine1(String addressLine1) {  
    this.addressLine1 = addressLine1;  
}  
public String getCity() {  
    return city;  
}  
public void setCity(String city) {  
    this.city = city;  
}  
public String getState() {  
    return state;  
}  
public void setState(String state) {  
    this.state = state;  
}  
public String getCountry() {  
    return country;  
}  
public void setCountry(String country) {  
    this.country = country;  
}  
public int getPincode() {  
    return pincode;  
}  
public void setPincode(int pincode) {  
    this.pincode = pincode;  
}  
public Employee getEmployee() {  
    return employee;  
}  
public void setEmployee(Employee employee) {  
    this.employee = employee;  
}    
}