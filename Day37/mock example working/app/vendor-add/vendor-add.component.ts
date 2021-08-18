import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Vendor } from '../vendor';
import { VendorService } from '../vendor.service';

@Component({
  selector: 'app-vendor-add',
  templateUrl: './vendor-add.component.html',
  styleUrls: ['./vendor-add.component.css']
})
export class VendorAddComponent implements OnInit {

  vendor : Vendor;
  isFormSubmitted : boolean;
  insert(vendorForm : NgForm) {
    // alert(this.vendor.ven_Id );
    // alert(this.vendor.ven_Name);
    // alert(this.vendor.ven_Number)
    // alert(this.vendor.ven_UserName)
    // alert(this.vendor.ven_Password)
    // alert(this.vendor.ven_Address)
    // alert(this.vendor.ven_Email)
    if (vendorForm.invalid) {
      return;
    }
    this.isFormSubmitted=true;
    this._vendorService.addVendor(this.vendor).subscribe(x => {

    })
    alert("Record Inserted")
  }
  constructor(private _vendorService : VendorService) {
    this.vendor = new Vendor();
    this.isFormSubmitted=false;
   }

  ngOnInit(): void {
  }

}
