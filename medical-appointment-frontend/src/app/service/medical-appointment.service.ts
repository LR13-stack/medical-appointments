import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

const baseUrl = 'http://localhost:8080';

@Injectable({
  providedIn: 'root'
})
export class MedicalAppointmentService {

  constructor(private http: HttpClient) { }

  postMedicalAppointment(data: any): Observable<any> {
    return this.http.post(`${baseUrl}/medical-appointment`, data);
  }

  getAllMedicalAppointments(): Observable<any> {
    return this.http.get(`${baseUrl}/medical-appointment`);
  }

  getAllHospitals(): Observable<any> {
    return this.http.get(`${baseUrl}/hospital`);
  }

  getAllMedicalSpecialties(): Observable<any> {
    return this.http.get(`${baseUrl}/medical-speciality`);
  }
}
