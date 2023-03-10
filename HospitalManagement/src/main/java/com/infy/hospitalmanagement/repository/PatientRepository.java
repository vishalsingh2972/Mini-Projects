package com.infy.hospitalmanagement.repository;

import com.infy.hospitalmanagement.entity.Patient;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PatientRepository extends CrudRepository<Patient, Integer>{

    List<Patient> findByDiagnosis(String diagnosis);

}
