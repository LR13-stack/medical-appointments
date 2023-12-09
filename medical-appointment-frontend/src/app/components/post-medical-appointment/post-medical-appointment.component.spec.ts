import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PostMedicalAppointmentComponent } from './post-medical-appointment.component';

describe('PostMedicalAppointmentComponent', () => {
  let component: PostMedicalAppointmentComponent;
  let fixture: ComponentFixture<PostMedicalAppointmentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [PostMedicalAppointmentComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(PostMedicalAppointmentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
