package com.newlife.hospital.management1.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Controller;

import com.newlife.hospital.management1.model.Admin;
import com.newlife.hospital.management1.model.Appointment;
import com.newlife.hospital.management1.repositary.AdminRepository;

@Controller
public class AdminController  {
	
	@Autowired
	private AdminRepository repo4;
	
	

	@PostConstruct
	public void processdoctor() {
		
		repo4.save(new Admin(101, "Dr.Raj", 1001, "Pediatrics", "Children", "abc@123", "Male", 123456789));
		repo4.save(new Admin(102, "Dr.Rahul", 1001, "Pediatrics", "Children", "def@123", "Male", 987654321));
		repo4.save(new Admin(103, "Dr.Neha", 1002, "Gynaecology", "Women", "ghi@123", "Female", 456123789));
		repo4.save(new Admin(104, "Dr.Priya", 1002, "Gynaecology", "Child-Birth", "jkl@123", "Female", 789123456));
		repo4.save(new Admin(105, "Dr.Parkash", 1003, "Cardiologist", "Heart", "mno@123", "Male", 123789456));
		repo4.save(new Admin(106, "Dr.Sunana", 1003, "Cardiologist", "Heart-Surgeon", "pqr@123", "Female", 789123456));
		repo4.save(new Admin(107, "Dr.Rachna", 1004, "Oncology", "Cancer", "stu@123", "Female", 784512963));
		repo4.save(new Admin(108, "Dr.Sujeet", 1004, "Oncology", "Tumor", "vwx@123", "Male", 794613852));
		repo4.save(new Admin(109, "Dr.Vivek", 1005, "Neurology", "Brain", "yza@123", "Male", 895623741));
		repo4.save(new Admin(110, "Dr.Vikas", 1005, "Neurology", "Brain", "bcd@123", "Male", 124578369));
	

}
}