package com.example.demo.service;
import javax.transaction.Transactional;
import java.util.List;
import com.example.demo.model.Vendor;
import com.example.demo.repository.VendorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class VendorService {

    @Autowired
    private VendorRepository repo;

    public void save(Vendor vendor) {
	        repo.save(vendor);
	}

    public void update(Vendor vendor) {
	   	repo.save(vendor);
	}

    public List<Vendor> showVendor() {
        return repo.findAll();
    }

    public Vendor searchById(int venId) {
        return repo.findById(venId).get();
    }



}