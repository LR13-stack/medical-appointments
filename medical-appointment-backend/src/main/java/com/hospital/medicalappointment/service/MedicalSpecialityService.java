package com.hospital.medicalappointment.service;

import com.hospital.medicalappointment.entity.MedicalSpeciality;
import com.hospital.medicalappointment.repository.MedicalSpecialityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MedicalSpecialityService {

    private final MedicalSpecialityRepository medicalSpecialityRepository;

    public MedicalSpeciality save(MedicalSpeciality medicalSpeciality) {
        return medicalSpecialityRepository.save(medicalSpeciality);
    }

    public MedicalSpeciality findById(Long id) {
        return medicalSpecialityRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        medicalSpecialityRepository.deleteById(id);
    }

    public List<MedicalSpeciality> findAll() {
        return medicalSpecialityRepository.findAll();
    }

    public MedicalSpeciality update(MedicalSpeciality medicalSpeciality) {
        return medicalSpecialityRepository.save(medicalSpeciality);
    }
}
