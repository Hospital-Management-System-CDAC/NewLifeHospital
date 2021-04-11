package com.newlife.hospital.management.repositary;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.newlife.hospital.management.model.Admin;


public interface AdminRepository extends JpaRepository<Admin, String> {
	@Query("from Admin where userid = :abc and password= :def")
	public Optional<Admin> match1(@Param("abc") String userid,@Param("def") String password);
}
