package com.hospital.medicalappointment.repository;

import com.hospital.medicalappointment.entity.MedicalAppointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalAppointmentRepository extends JpaRepository<MedicalAppointment, Long>{
}
