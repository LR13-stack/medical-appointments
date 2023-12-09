package com.hospital.medicalappointment.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "medical_appointments")
public class MedicalAppointment {
    @Id
    @GeneratedValue
    private Long id;

    private int dni;
    private Date date;

    @ManyToOne
    @JoinColumn(name = "hospital_id")
    private Hospital hospital;

    @ManyToOne
    @JoinColumn(name = "medical_speciality_id")
    private MedicalSpeciality medicalSpeciality;
}
