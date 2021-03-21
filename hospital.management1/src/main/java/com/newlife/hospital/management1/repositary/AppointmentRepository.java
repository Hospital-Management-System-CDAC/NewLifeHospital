package com.newlife.hospital.management1.repositary;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.newlife.hospital.management1.model.Appoinment;
import com.newlife.hospital.management1.model.Patients;

public interface AppoinmentRepositary extends JpaRepository<Appoinment, Long>{
	@Query("SELECT p FROM Appoinment p WHERE p.date = ?1")
    public Appoinment findByDate(String date);
}
