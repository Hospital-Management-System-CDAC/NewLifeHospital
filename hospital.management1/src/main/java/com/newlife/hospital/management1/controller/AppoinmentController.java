package com.newlife.hospital.management1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.newlife.hospital.management1.model.Appoinment;
import com.newlife.hospital.management1.repositary.AppoinmentRepositary;

@Controller
public class AppoinmentController {
	@Autowired
	private AppoinmentRepositary repo1;
	
	@PostMapping("/processAppoinment")
	public String processAppoinment(Appoinment appoinment) {
		
	repo1.save(appoinment);
		
		
		return "appoinment_success";
	}
}
