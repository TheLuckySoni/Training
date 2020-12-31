package com.nexogic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nexogic.dao.PatientRepo;
import com.nexogic.model.Patient;

@Service
public class PatientService {

	@Autowired
	PatientRepo repo;

	public List<Patient> getPatients() {
		List<Patient> patients = (List<Patient>) repo.findAll();
		return patients;
	}

	public Patient getPatient(int id) {
		Patient patient = repo.findById(id).orElse(new Patient("", "", "", "", "", "", null));
		return patient;
	}

	public Patient addPatient(Patient patient) {
		Patient savePatient = repo.save(patient);
		return savePatient;
	}

	public Patient updatePatient(Patient patient) {
		Patient updatePatient = repo.save(patient);
		return updatePatient;
	}

	public void deletePatient(Patient patient) {
		repo.delete(patient);

	}

	public void deletebyIdPatient(int id) {
		repo.deleteById(id);
	}

}
