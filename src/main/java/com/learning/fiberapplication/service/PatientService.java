package com.learning.fiberapplication.service;

import com.learning.fiberapplication.entity.Patient;
import com.learning.fiberapplication.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;
    public List<Patient>getAllPatients(Integer pageNo, Integer pageSize, String sortBy){
        Pageable pageable = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
        Page<Patient> page = patientRepository.findAll(pageable);
        if (page.hasContent()) return page.getContent();
        else return new ArrayList<Patient>();
    }
}
