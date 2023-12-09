package com.hospital.medicalappointment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "medical_specialities")
public class MedicalSpeciality {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
