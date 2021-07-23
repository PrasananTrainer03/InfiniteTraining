package com.java.infinite.beans;

import java.sql.SQLException;

public class EmployBean {

	public Emp[] showEmploy() throws ClassNotFoundException, SQLException {
		return new EmployDAO().showEmploy();
	}
}
