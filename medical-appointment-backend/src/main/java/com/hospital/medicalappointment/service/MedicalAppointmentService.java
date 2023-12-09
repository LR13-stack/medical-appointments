package com.hospital.medicalappointment.service;

import com.hospital.medicalappointment.entity.MedicalAppointment;
import com.hospital.medicalappointment.repository.MedicalAppointmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MedicalAppointmentService {

    private final MedicalAppointmentRepository medicalAppointmentRepository;

    public MedicalAppointment save(MedicalAppointment medicalAppointment) {
        return medicalAppointmentRepository.save(medicalAppointment);
    }

    public MedicalAppointment findById(Long id) {
        return medicalAppointmentRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        medicalAppointmentRepository.deleteById(id);
    }

    public List<MedicalAppointment> findAll() {
        return medicalAppointmentRepository.findAll();
    }

    public MedicalAppointment update(MedicalAppointment medicalAppointment) {
        return medicalAppointmentRepository.save(medicalAppointment);
    }
}
