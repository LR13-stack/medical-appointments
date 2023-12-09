import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PostMedicalAppointmentComponent } from './components/post-medical-appointment/post-medical-appointment.component';
import { GetAllMedicalAppointmentsComponent } from './components/get-all-medical.appointments/get-all-medical.appointments.component';

const routes: Routes = [
  { path: 'medical-appointment', component: PostMedicalAppointmentComponent },
  { path: '', component: GetAllMedicalAppointmentsComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
