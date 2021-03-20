package com.newlife.hospital.management1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.newlife.hospital.management1.model.Patients;
import com.newlife.hospital.management1.repositary.PatientsRepositary;

@Controller
public class AppController {
	@Autowired
	private PatientsRepositary repo;
	@GetMapping("")
    public String viewHomePage() {
        return "index";
    }
	@GetMapping("/register")
	public String showRegistrationForm(Model model) {
	    model.addAttribute("patient", new Patients());
	     
	    return "signup_form";
	}
	@PostMapping("/process_register")
	public String processRegister(Patients patient) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(patient.getPassword());
		patient.setPassword(encodedPassword);
		repo.save(patient);
		
		
		return "register_success";
	}
	@GetMapping("/patients")
	public String listUsers(Model model) {
		
		List<Patients> listUsers = repo.findAll();
		model.addAttribute("listUsers", listUsers);
		return "users";
	}
}
