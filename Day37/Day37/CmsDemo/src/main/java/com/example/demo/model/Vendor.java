package com.example.demo.model;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Vendor {
    @Id
    private int ven_Id;
    private String ven_Name;
    private String ven_Number;
    private String ven_UserName;
    private String ven_Password;
    private String ven_Email;
    private String ven_Address;

    public int getVen_Id() {
			return ven_Id;
		}
		public void setVen_Id(int ven_Id) {
			this.ven_Id = ven_Id;
		}
		public String getVen_Name() {
			return ven_Name;
		}
		public void setVen_Name(String ven_Name) {
			this.ven_Name = ven_Name;
		}
		public String getVen_Number() {
			return ven_Number;
		}
		public void setVen_Number(String ven_Number) {
			this.ven_Number = ven_Number;
		}
		public String getVen_UserName() {
			return ven_UserName;
		}
		public void setVen_UserName(String ven_UserName) {
			this.ven_UserName = ven_UserName;
		}
		public String getVen_Password() {
			return ven_Password;
		}
		public void setVen_Password(String ven_Password) {
			this.ven_Password = ven_Password;
		}
		public String getVen_Email() {
			return ven_Email;
		}
		public void setVen_Email(String ven_Email) {
			this.ven_Email = ven_Email;
		}
		public String getVen_Address() {
			return ven_Address;
		}
		public void setVen_Address(String ven_Address) {
			this.ven_Address = ven_Address;
		}
	    

    	    
}