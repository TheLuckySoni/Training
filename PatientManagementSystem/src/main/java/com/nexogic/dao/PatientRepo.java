package com.nexogic.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nexogic.model.Patient;

@Repository
public interface PatientRepo extends CrudRepository<Patient, Integer> {

}
