package com.hospital.medicalappointment.service;

import com.hospital.medicalappointment.entity.Hospital;
import com.hospital.medicalappointment.repository.HospitalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HospitalService {

    private final HospitalRepository hospitalRepository;

    public Hospital save(Hospital hospital) {
        return hospitalRepository.save(hospital);
    }

    public Hospital findById(Long id) {
        return hospitalRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        hospitalRepository.deleteById(id);
    }

    public List<Hospital> findAll() {
        return hospitalRepository.findAll();
    }

    public Hospital update(Hospital hospital) {
        return hospitalRepository.save(hospital);
    }
}
