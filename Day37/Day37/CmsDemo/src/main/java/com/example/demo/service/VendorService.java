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

    public List<Vendor> showVendor() {
        return repo.findAll();
    }
}