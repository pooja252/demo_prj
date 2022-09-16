package com.patientregistartion.assignmentdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patientregistartion.assignmentdemo.entity.PatientDetails;

public interface PatientRepository extends JpaRepository<PatientDetails, Integer> {

}
