package com.hospital.medicalappointment.controller;

import com.hospital.medicalappointment.entity.MedicalSpeciality;
import com.hospital.medicalappointment.service.MedicalSpecialityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medical-speciality")
@RequiredArgsConstructor
@CrossOrigin("*")
public class MedicalSpecialityController {

    private final MedicalSpecialityService medicalSpecialityService;

    @PostMapping
    public MedicalSpeciality saveMedicalSpeciality(@RequestBody MedicalSpeciality ms){
        return medicalSpecialityService.save(ms);
    }

    @GetMapping("/{id}")
    public MedicalSpeciality findById(@PathVariable Long id){
        return medicalSpecialityService.findById(id);
    }

    @PutMapping("/{id}")
    public MedicalSpeciality update(@RequestBody MedicalSpeciality ms){
        return medicalSpecialityService.update(ms);
    }

    @GetMapping
    public List<MedicalSpeciality> getAll() {
        return medicalSpecialityService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        medicalSpecialityService.deleteById(id);
    }
}
