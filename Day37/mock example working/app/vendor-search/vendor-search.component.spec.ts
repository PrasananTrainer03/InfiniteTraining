import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VendorSearchComponent } from './vendor-search.component';

describe('VendorSearchComponent', () => {
  let component: VendorSearchComponent;
  let fixture: ComponentFixture<VendorSearchComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ VendorSearchComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(VendorSearchComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
