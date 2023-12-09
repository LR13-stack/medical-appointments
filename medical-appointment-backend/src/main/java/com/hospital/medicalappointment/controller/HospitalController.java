package com.hospital.medicalappointment.controller;

import com.hospital.medicalappointment.entity.Hospital;
import com.hospital.medicalappointment.entity.MedicalSpeciality;
import com.hospital.medicalappointment.service.HospitalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospital")
@RequiredArgsConstructor
@CrossOrigin("*")
public class HospitalController {

    private final HospitalService hospitalService;

    @PostMapping
    public Hospital save(@RequestBody Hospital hospital) {
        return hospitalService.save(hospital);
    }

    @GetMapping("/{id}")
    public Hospital findById(@PathVariable Long id){
        return hospitalService.findById(id);
    }

    @PutMapping("/{id}")
    public Hospital update(@RequestBody Hospital hospital){
        return hospitalService.update(hospital);
    }

    @GetMapping
    public List<Hospital> getAll() {
        return hospitalService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
       hospitalService.deleteById(id);
    }
}
