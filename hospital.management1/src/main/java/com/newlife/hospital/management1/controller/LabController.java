package com.newlife.hospital.management1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.newlife.hospital.management1.model.Appoinment;
import com.newlife.hospital.management1.model.Lab;
import com.newlife.hospital.management1.repositary.LabRepositary;
@Controller
public class LabController {
	@Autowired
  private LabRepositary repo3;
	
	@PostMapping("/processLab")
	public String processAppoinment(Lab lab) {
		
	repo3.save(lab);
		
		
		return "lab_success";
	}
	
}
