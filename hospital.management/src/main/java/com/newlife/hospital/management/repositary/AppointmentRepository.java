package com.newlife.hospital.management.repositary;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.newlife.hospital.management.model.Appointment;




public interface AppointmentRepository extends JpaRepository<Appointment, Long>{

	
	@Query("from Appointment where email =:abc")
	List<Appointment> findByEmail(@Param("abc") String email);


	
}
