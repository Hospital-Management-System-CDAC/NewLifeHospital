package com.newlife.hospital.management1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.newlife.hospital.management1.repositary.AppointmentRepository;
import com.newlife.hospital.management1.repositary.LabRepository;
import com.newlife.hospital.management1.repositary.PatientsRepository;

@RestController
public class AppRestController {
	@Autowired
	private PatientsRepository repo;
	@Autowired
	  private LabRepository repo3;
	@Autowired
	private AppointmentRepository repo1;
}
