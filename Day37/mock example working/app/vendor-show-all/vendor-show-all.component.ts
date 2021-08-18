import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Vendor } from '../vendor';
import { VendorService } from '../vendor.service';

@Component({
  selector: 'app-vendor-show-all',
  templateUrl: './vendor-show-all.component.html',
  styleUrls: ['./vendor-show-all.component.css']
})
export class VendorShowAllComponent implements OnInit {

  vendors : Observable<Vendor[]>;

  constructor(private _vendorService : VendorService) {
    this.vendors = this._vendorService.showVendor();
   }

  ngOnInit(): void {
  }

}
