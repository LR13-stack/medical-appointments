import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GetAllMedicalAppointmentsComponent } from './get-all-medical.appointments.component';

describe('GetAllMedicalAppointmentsComponent', () => {
  let component: GetAllMedicalAppointmentsComponent;
  let fixture: ComponentFixture<GetAllMedicalAppointmentsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [GetAllMedicalAppointmentsComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(GetAllMedicalAppointmentsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
