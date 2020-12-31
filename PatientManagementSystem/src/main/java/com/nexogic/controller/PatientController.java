package com.nexogic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nexogic.model.Patient;
import com.nexogic.service.PatientService;

@RestController
public class PatientController {

	@Autowired
	PatientService Service;

	@GetMapping("patients")
	public List<Patient> patientDetails() {
		return Service.getPatients();
	}

	@GetMapping("patient/{pid}")
	public Patient patientDetail(@PathVariable("pid") int id) {
		return Service.getPatient(id);
	}

	@PostMapping("patient")
	public Patient addPatinet(@RequestBody Patient patient) {
		Patient savePatient = Service.addPatient(patient);
		return savePatient;
	}

	@PutMapping("patient")
	public Patient updatePatient(@RequestBody Patient patient) {
		Patient updatePatient = Service.updatePatient(patient);
		return updatePatient;
	}

	@DeleteMapping("patient")
	public void deletePatient(@RequestBody Patient patient) {
		Service.deletePatient(patient);

	}

	@DeleteMapping("patient/{pid}")
	public void deletebyIdPatient(@PathVariable("pid") int id) {
		Service.deletebyIdPatient(id);
	}

}
