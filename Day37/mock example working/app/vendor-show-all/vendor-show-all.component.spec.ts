import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VendorShowAllComponent } from './vendor-show-all.component';

describe('VendorShowAllComponent', () => {
  let component: VendorShowAllComponent;
  let fixture: ComponentFixture<VendorShowAllComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ VendorShowAllComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(VendorShowAllComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
