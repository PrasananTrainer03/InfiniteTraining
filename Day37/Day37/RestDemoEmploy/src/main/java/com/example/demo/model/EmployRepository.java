package com.example.demo.model;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployRepository extends JpaRepository<Employ, Integer> {
	List<Employ> searchByDept(String dept);
	// select * from Employ where dept=?
}
