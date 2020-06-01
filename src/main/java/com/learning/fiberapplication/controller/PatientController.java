package com.learning.fiberapplication.controller;

import com.learning.fiberapplication.entity.Patient;
import com.learning.fiberapplication.repository.PatientRepository;
import com.learning.fiberapplication.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class PatientController {

    @Autowired
    PatientService patientService;
    @Autowired
    PatientRepository patientRepository;

    @GetMapping("/ten_patients")
    List<Patient> getAllPatients(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "10") Integer pageSize,
            @RequestParam(defaultValue = "id") String sortBy
    ){
        return patientService.getAllPatients(pageNo, pageSize, sortBy);
    }
    @PostMapping("/save_patient")
    Patient savePatient(@RequestBody Patient patient){
        return patientRepository.save(patient);

    }
}
