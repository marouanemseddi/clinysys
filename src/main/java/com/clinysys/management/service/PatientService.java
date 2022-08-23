package com.clinysys.management.service;


	import java.util.ArrayList;  
	import java.util.List;  
	import org.springframework.beans.factory.annotation.Autowired;  
	import org.springframework.stereotype.Service;

import com.clinysys.management.model.Patient;
import com.clinysys.management.repository.PatientRepository;


	//defining the business logic  
	@Service  
	public class PatientService   
	{  
		@Autowired  
		PatientRepository patientRepository;  
		//getting all Patient record by using the method findaAll() of CrudRepository  
		public List<Patient> getAllPatient()   
		{  
			List<Patient> patients = new ArrayList<Patient>();  
			patientRepository.findAll().forEach(Patient1 -> patients.add(Patient1));  
			return patients;  	
		}  
		//getting a specific record by using the method findById() of CrudRepository  
		public Patient getPatientById(int id)   
		{  
			return patientRepository.findById(id).get();  
		}  
		//saving a specific record by using the method save() of CrudRepository  
		public void saveOrUpdate(Patient Patient)   
		{  
			patientRepository.save(Patient);  
		}  
		//deleting a specific record by using the method deleteById() of CrudRepository  
		public void delete(int id)   
		{  
			patientRepository.deleteById(id);  
		}  

	}  
