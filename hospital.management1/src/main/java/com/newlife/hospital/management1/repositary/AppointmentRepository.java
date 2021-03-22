package com.newlife.hospital.management1.repositary;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.newlife.hospital.management1.model.Appointment;
import com.newlife.hospital.management1.model.Patients;



public interface AppointmentRepository extends JpaRepository<Appointment, Long>{

	
	@Query("from Appointment where email =:abc")
	List<Appointment> findById(@Param("abc") String email);
//	@Query("from Acc where balance < :abc")
//	public List<Acc> f1(@Param("abc") int bal);

	
}