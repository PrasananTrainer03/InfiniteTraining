package com.java.hexa.spring.dao;

import java.util.List;

import com.java.hexa.spring.model.Employ;

public interface EmployDAO {
	List<Employ> listEmploy();
	void addEmploy(Employ employ);
}
