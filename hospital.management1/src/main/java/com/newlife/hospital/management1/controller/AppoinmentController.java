package com.newlife.hospital.management1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.newlife.hospital.management1.model.Appointment;
import com.newlife.hospital.management1.repositary.AppointmentRepository;

@Controller
public class AppoinmentController {
	@Autowired
	private AppointmentRepository repo1;
	
	@PostMapping("/processAppoinment")
	public String processAppoinment(Appointment appoinment) {
		
	repo1.save(appoinment);
		
		
		return "appoinment_success";
	}
}
