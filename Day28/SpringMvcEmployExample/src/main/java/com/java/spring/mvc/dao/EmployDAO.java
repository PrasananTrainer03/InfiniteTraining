package com.java.spring.mvc.dao;

import java.util.List;

import com.java.spring.mvc.model.Employ;

public interface EmployDAO {
	
	List<Employ> list();
	void addEmploy(Employ employ);
	void updateEmploy(Employ employ);
	Employ get(int empno);
	void deleteEmploy(int empno);
}
