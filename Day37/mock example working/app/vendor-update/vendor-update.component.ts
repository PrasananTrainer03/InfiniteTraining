import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Vendor } from '../vendor';
import { VendorService } from '../vendor.service';

@Component({
  selector: 'app-vendor-update',
  templateUrl: './vendor-update.component.html',
  styleUrls: ['./vendor-update.component.css']
})
export class VendorUpdateComponent implements OnInit {

  vendor : Vendor;
  isFormSubmitted : boolean;
  update(vendorForm : NgForm) {
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
    this._vendorService.updateVendor(this.vendor).subscribe(x => {

    })
    alert("Record Updated")
  }

  show() {
    alert(this.vendor.ven_Id)
    this._vendorService.searchVendor(this.vendor.ven_Id).subscribe(x => {
      this.vendor=x;
    })
  }
  constructor(private _vendorService : VendorService) {
    this.vendor=new Vendor();
   }

  ngOnInit(): void {
  }

}
