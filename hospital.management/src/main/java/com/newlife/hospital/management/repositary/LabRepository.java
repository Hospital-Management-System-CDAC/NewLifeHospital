package com.newlife.hospital.management.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.newlife.hospital.management.model.Lab;


public interface LabRepository  extends JpaRepository<Lab, Long>{
	@Query("from Lab where email =:abc")
	List<Lab> findById(@Param("abc") String email );

	List<Lab> findByEmail(String email);

}
