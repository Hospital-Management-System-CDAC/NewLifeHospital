package com.newlife.hospital.management1.repositary;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.newlife.hospital.management1.model.Appointment;
import com.newlife.hospital.management1.model.Patients;

public interface AppointmentRepository extends JpaRepository<Appointment, Long>{
	
}
