package com.newlife.hospital.management1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.newlife.hospital.management1.model.Appointment;
import com.newlife.hospital.management1.model.Patients;
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
	@GetMapping("/oldappoinment" )
	public String listUsers(@RequestParam(value="email",required = false) String email,Model model) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String name = authentication.getName();
		List<Appointment> listUser = repo1.findById(name);
		model.addAttribute("listUser", listUser);
		return "appoinment_list";
	}
}
