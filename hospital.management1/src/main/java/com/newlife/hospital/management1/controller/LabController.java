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
import com.newlife.hospital.management1.model.Lab;
import com.newlife.hospital.management1.repositary.LabRepository;
@Controller
public class LabController {
	@Autowired
  private LabRepository repo3;
	
	@PostMapping("/processLab")
	public String processAppoinment(Lab lab) {
		
	repo3.save(lab);
		
		
		return "lab_success";
	}
	@GetMapping("/oldlab" )
	public String listUsers(@RequestParam(value="email",required = false) String email,Model model) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String name = authentication.getName();
		List<Lab> listUser1 = repo3.findById(name);
		model.addAttribute("listUser1", listUser1);
		return "lab_list";
	}
}
