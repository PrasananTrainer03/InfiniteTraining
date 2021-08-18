import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { VendorShowAllComponent } from './vendor-show-all/vendor-show-all.component';
import { VendorSearchComponent } from './vendor-search/vendor-search.component';
import { VendorAddComponent } from './vendor-add/vendor-add.component';
import { VendorUpdateComponent } from './vendor-update/vendor-update.component';

@NgModule({
  declarations: [
    AppComponent,
    VendorShowAllComponent,
    VendorSearchComponent,
    VendorAddComponent,
    VendorUpdateComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
