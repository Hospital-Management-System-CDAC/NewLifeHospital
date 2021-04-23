package com.newlife.hospital.management.repositary;


import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.newlife.hospital.management.model.Patients;

public interface PatientsRepository extends JpaRepository<Patients, Long>{
	@Query("from Patients where email =:abc")
	Patients findById(@Param("abc") String email);
	@Query("from Patients where email = :username")
	public Patients find(@Param("username") String email);
	@Query("from Patients where email = :abc and password= :def")
	public Optional<Patients> match(@Param("abc") String email,@Param("def") String password);
	
	

	
	 
}
   