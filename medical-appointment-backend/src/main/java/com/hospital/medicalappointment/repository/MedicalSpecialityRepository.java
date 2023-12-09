package com.hospital.medicalappointment.repository;

import com.hospital.medicalappointment.entity.MedicalSpeciality;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalSpecialityRepository extends JpaRepository<MedicalSpeciality, Long> {
}
