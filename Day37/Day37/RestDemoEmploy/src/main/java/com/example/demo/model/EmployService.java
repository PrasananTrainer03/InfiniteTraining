package com.example.demo.model;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EmployService {

	@Autowired
    private EmployRepository repo;
	
	public List<Employ> listAll() {
        return repo.findAll();
    }
	
	 public void save(Employ employ) {
	        repo.save(employ);
	    }
	     
	    public Employ get(Integer id) {
	        return repo.findById(id).get();
	    }
	     
	    public void delete(Integer id) {
	        repo.deleteById(id);
	       // repo.
	    }
	    
	    public List<Employ> searchByDept(String dept) {
	    	return repo.searchByDept(dept);
	    }
}
