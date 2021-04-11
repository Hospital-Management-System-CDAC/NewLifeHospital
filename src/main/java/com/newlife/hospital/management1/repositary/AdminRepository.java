package com.newlife.hospital.management1.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newlife.hospital.management1.model.Admin;


public interface AdminRepository extends JpaRepository<Admin, Integer> {

}
