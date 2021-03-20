package com.newlife.hospital.management1.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.newlife.hospital.management1.model.Patients;

public interface PatientsRepositary extends JpaRepository<Patients, Long>{
	 @Query("SELECT p FROM Patients p WHERE p.email = ?1")
	    public Patients findByEmail(String email);
}
