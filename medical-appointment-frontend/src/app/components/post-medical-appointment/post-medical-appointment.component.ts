import { Component } from '@angular/core';
import { MedicalAppointmentService } from '../../service/medical-appointment.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-post-medical-appointment',
  templateUrl: './post-medical-appointment.component.html',
  styleUrl: './post-medical-appointment.component.css'
})
export class PostMedicalAppointmentComponent {
  hospitals: any = [];
  medicalSpecialties: any = [];

  postMedicalAppointmentForm: FormGroup = new FormGroup({});

  constructor(private medicalAppointmentService: MedicalAppointmentService, private formBuilder: FormBuilder, private router: Router) { }

  ngOnInit(): void {
    this.postMedicalAppointmentForm = this.formBuilder.group({
      dni: [null, [Validators.required, Validators.minLength(8)]],
      date: [null, [Validators.required]],
      medicalSpeciality: [null, [Validators.required]],
      hospital: [null, [Validators.required]],
    });
    this.getAllHospitals();
    this.getAllMedicalSpecialties();
  }

  postMedicalAppointment(): void {
    console.log(this.postMedicalAppointmentForm.value);
    this.medicalAppointmentService.postMedicalAppointment(this.postMedicalAppointmentForm.value)
      .subscribe(
        data => {
          console.log(data);
          this.router.navigate(['']);
        },
        error => {
          console.log(error);
        });
  }

  getAllHospitals(): void {
    this.medicalAppointmentService.getAllHospitals()
      .subscribe(
        data => {
          console.log(data);
          this.hospitals = data;
        },
        error => {
          console.log(error);
        });
  }

  getAllMedicalSpecialties(): void {
    this.medicalAppointmentService.getAllMedicalSpecialties()
      .subscribe(
        data => {
          console.log(data);
          this.medicalSpecialties = data;
        },
        error => {
          console.log(error);
        });
  }
}
