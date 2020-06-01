package com.learning.fiberapplication.repository;

import com.learning.fiberapplication.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long>, PagingAndSortingRepository<Patient, Long> {
}
