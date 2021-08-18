package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.model.Vendor;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class VendorController {

    @Autowired
    private VendorService vendorService;

    @GetMapping("/")
	public List<Vendor> list() {
	    return vendorService.showVendor();
	}

}