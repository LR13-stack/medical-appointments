import { Component } from '@angular/core';
import { MedicalAppointmentService } from '../../service/medical-appointment.service';

@Component({
  selector: 'app-get-all-medical.appointments',
  templateUrl: './get-all-medical.appointments.component.html',
  styleUrl: './get-all-medical.appointments.component.css'
})
export class GetAllMedicalAppointmentsComponent {
  medicalAppointments: any = [];

  constructor(private medicalAppointmentService: MedicalAppointmentService) { }

  ngOnInit(): void {
    this.getAllMedicalAppointments();
  }

  getAllMedicalAppointments(): void {
    this.medicalAppointmentService.getAllMedicalAppointments()
      .subscribe(
        data => {
          console.log(data);
          this.medicalAppointments = data;
        },
        error => {
          console.log(error);
        });
  }
}
