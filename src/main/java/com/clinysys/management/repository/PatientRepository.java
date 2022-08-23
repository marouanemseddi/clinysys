package com.clinysys.management.repository;



import org.springframework.data.repository.CrudRepository;

import com.clinysys.management.model.Patient;


//repository that extends CrudRepository  
public interface PatientRepository extends CrudRepository<Patient, Integer>  
{  
}  