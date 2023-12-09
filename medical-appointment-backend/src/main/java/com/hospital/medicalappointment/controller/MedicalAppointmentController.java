package com.hospital.medicalappointment.controller;

import com.hospital.medicalappointment.entity.MedicalAppointment;
import com.hospital.medicalappointment.service.MedicalAppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medical-appointment")
@RequiredArgsConstructor
@CrossOrigin("*")
public class MedicalAppointmentController {

    private final MedicalAppointmentService medicalAppointmentService;

    @PostMapping
    public MedicalAppointment save(@RequestBody MedicalAppointment ma) {
        return medicalAppointmentService.save(ma);
    }

    @GetMapping("/{id}")
    public MedicalAppointment findById(@PathVariable Long id){
        return medicalAppointmentService.findById(id);
    }

    @PutMapping("/{id}")
    public MedicalAppointment update(@RequestBody MedicalAppointment ma){
        return medicalAppointmentService.update(ma);
    }

    @GetMapping
    public List<MedicalAppointment> getAll() {
        return medicalAppointmentService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        medicalAppointmentService.deleteById(id);
    }
}
