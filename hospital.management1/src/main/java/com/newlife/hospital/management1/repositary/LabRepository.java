package com.newlife.hospital.management1.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.newlife.hospital.management1.model.Lab;


public interface LabRepository  extends JpaRepository<Lab, Long>{
	@Query("from Lab where email =:abc")
	List<Lab> findById(@Param("abc") String email );
//	@Query("from Appointment where email =:abc")
//	List<Appointment> findById(@Param("abc") String email);
}
