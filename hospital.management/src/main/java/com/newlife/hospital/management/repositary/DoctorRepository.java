package com.newlife.hospital.management.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newlife.hospital.management.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
