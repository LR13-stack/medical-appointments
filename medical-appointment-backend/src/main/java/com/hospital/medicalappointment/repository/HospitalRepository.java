package com.hospital.medicalappointment.repository;

import com.hospital.medicalappointment.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospital, Long> {
}
