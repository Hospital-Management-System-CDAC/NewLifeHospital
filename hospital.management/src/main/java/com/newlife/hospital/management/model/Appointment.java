package com.newlife.hospital.management.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "appointment")
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false, length = 64)
	private String name;
	@Column(nullable = false, length = 64)
	private String email;
	@Column(nullable = false, length = 64)
	private String doctorname;
	@Column(nullable = false, length = 64)
	private String department;
	@Column(nullable = false, length = 64)
	private String date;
	@Column(nullable = false, length = 64)
	private String slot;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDoctorname() {
		return doctorname;
	}
	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSlot() {
		return slot;
	}
	public void setSlot(String slot) {
		this.slot = slot;
	}
	public Appointment(long id, String name, String email, String doctorname, String department, String date,
			String slot) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.doctorname = doctorname;
		this.department = department;
		this.date = date;
		this.slot = slot;
	}
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	

	

	
}
