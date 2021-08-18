package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.model.Vendor;
import java.util.List;
import org.springframework.http.ResponseEntity;
import java.util.NoSuchElementException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class VendorController {

    @Autowired
    private VendorService vendorService;

    @GetMapping("/")
	public List<Vendor> list() {
	    return vendorService.showVendor();
	}

	@PostMapping("/vendor/vendoradd")
	public void add(@RequestBody Vendor vendor) {
	    vendorService.save(vendor);
	}

    @PutMapping("/vendor/vendorUpdate")
	public void update(@RequestBody Vendor vendor) {
		vendorService.update(vendor);
	}

   	@GetMapping("/{id}")
	public ResponseEntity<Vendor> get(@PathVariable Integer id) {
	    try {
	        Vendor vendor = vendorService.searchById(id);
	        return new ResponseEntity<Vendor>(vendor, HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<Vendor>(HttpStatus.NOT_FOUND);
	    }      
	}


}