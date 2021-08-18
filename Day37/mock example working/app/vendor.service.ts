import { Injectable } from '@angular/core';
import { Http,Response } from '@angular/http';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/map';
import { Vendor } from './vendor';

@Injectable({
  providedIn: 'root'
})
export class VendorService {

  showVendor() : Observable<Vendor[]> {
    return this._http.get("http://localhost:8282/").map((res : Response) => res.json());
  }

  updateVendor(vendor : Vendor) : Observable<any> {
    return this._http.put("http://localhost:8282/vendor/vendorUpdate",vendor)
    .map((res: Response)=> null);
  }
  searchVendor(vid : number) : Observable<Vendor> {
    return this._http.get("http://localhost:8282/" +vid).map((res : Response) => res.json());
  }
  
  addVendor(vendor: Vendor) : Observable<any> {
    return this._http.post("http://localhost:8282/vendor/vendoradd",vendor)
    .map((res: Response)=> null);
  }

  constructor(private _http : Http) { }

}
