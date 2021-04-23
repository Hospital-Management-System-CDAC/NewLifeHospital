package com.newlife.hospital.management.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.newlife.hospital.management.exception.ResourceNotFoundException;
import com.newlife.hospital.management.model.Admin;
import com.newlife.hospital.management.model.Appointment;
import com.newlife.hospital.management.model.Lab;
import com.newlife.hospital.management.model.Patients;
import com.newlife.hospital.management.repositary.AdminRepository;
import com.newlife.hospital.management.repositary.AppointmentRepository;
import com.newlife.hospital.management.repositary.DoctorRepository;
import com.newlife.hospital.management.repositary.LabRepository;
import com.newlife.hospital.management.repositary.PatientsRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1/")
@RestController
public class AppRestController {
	@Autowired
	private PatientsRepository repo;
	@Autowired
	private AppointmentRepository repo1;
	@Autowired
	private AdminRepository repo2;
	@Autowired
	private LabRepository repo3;
	@Autowired
	private DoctorRepository repo4;

	// Patient login

	@PostMapping("/dologin")
	public ResponseEntity<Patients> login(@RequestParam(value="email")String email, @RequestParam(value="password")String password) {

	 Optional<Patients> c =repo.match(email, password);
	 if (c.isPresent()) {
	Patients patient=c.get();
		return ResponseEntity.ok(patient);
	 }
	 else {
			 
					return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
			 }
	 
	}

	// Patient Registration
	@PostMapping("/process_register")
	public Patients processRegister(@RequestBody Patients patient) {

		return repo.save(patient);
	}
	
	@PutMapping("/update_patient")
	public Patients processUpdate(@RequestBody Patients patient) {
		
		Optional<Patients> c =repo.match(patient.getEmail(),patient.getPassword());
		if (c.isPresent()) {
			Patients tempPatient=c.get();
			patient.setId(tempPatient.getId());
		}
		 
		
		return repo.save(patient);
		 
		
	}

	// find patient by id
	@GetMapping("/patients/{id}")
	public ResponseEntity<Patients> getThemById(@PathVariable Long id) {
		Optional<Patients>patient =  repo.findById(id);
				return patient.map(response -> ResponseEntity.ok().body(response))
		                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
				
	}

	// book new Appointment
	@PostMapping("/processAppointment")
	public Appointment processAppointment(@RequestBody Appointment appoinment) {

		return repo1.save(appoinment);
	}

	// Patient Old Appointment
	@GetMapping("/oldappoinment/{email}")
	public ResponseEntity<List<Appointment>> listUsers(@PathVariable String email) {

		List<Appointment> listUser = repo1.findByEmail(email);

		return ResponseEntity.ok(listUser);
	}

	// find old lab booking
	@GetMapping("/oldlab/{email}")
	public ResponseEntity<List<Lab>> listUsersLab(@PathVariable String email) {

		List<Lab> listUser1 = repo3.findByEmail(email);
		return ResponseEntity.ok(listUser1);

	}

	// book new lab
	@PostMapping("/processLab")
	public Lab processAppoinment(@RequestBody Lab lab) {

		return repo3.save(lab);

	}

	// Admin module
	@GetMapping("/doadminlogin")
	public ResponseEntity<Admin> login2(@RequestParam(value = "userid") String userid,
			@RequestParam(value = "password") String password) {

		Optional<Admin> c = repo2.match1(userid, password);
		if (c.isPresent()) {
			Admin admin = c.get();
			return ResponseEntity.ok(admin);
		} else {

			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}

	}

	// display all patient
	@GetMapping("/patients")
	public List<Patients> listUsers() {

		List<Patients> listUsers = repo.findAll();

		return listUsers;
	}

	// add patient by admin
	@PostMapping("/patients")
	public Patients createPatient1(@RequestBody Patients patient) {
		return repo.save(patient);
	}

	// delete patient by admin
	@DeleteMapping("/patients")
	public ResponseEntity<Map<String, Boolean>> deletePatient(@RequestParam(value = "userid") String email) {
		Patients patient = (Patients) repo.findById(email);
		// .orElseThrow(() -> new ResourceNotFoundException("Patient not exist with id
		// :" + email));

		repo.delete(patient);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}

	// get all appointment by admin
	@GetMapping("/appointment")
	public List<Appointment> listAppointments() {

		List<Appointment> listAppointments1 = repo1.findAll();

		return listAppointments1;
	}

	// save new appointment by admin
	@PostMapping("/appointment")
	public Appointment createAppointment(@RequestBody Appointment appointment) {
		return repo1.save(appointment);
	}

	// delete appointment by admin
	@DeleteMapping("/appointment/{email}")
	public ResponseEntity<Map<String, Boolean>> deleteAppointment(@PathVariable Long id) {
		Appointment patient = repo1.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Appoinment not exist with id :" + id));

		repo1.delete(patient);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}

}