package com.newlife.hospital.management1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Appointment")
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false, length = 64)
	private String name;
	@Column(nullable = false, length = 64)
	private String email;
	@Column(nullable = false, length = 64)
	private String doctername;
	@Column(nullable = false, length = 64)
	private String department;
	@Column(nullable = false, length = 64)
	private String date;
	@Column(nullable = false, length = 64)
	private String slot;
	@Column(name = "age", nullable = false, length = 20)
	private int age;

	@Column(name = "gender", nullable = false, length = 20)
	private String gender;

	@Column(name = "address", nullable = false, length = 100)
	private String address;

	@Column(name = "phone", nullable = false, length = 50)
	private long phoneNumber;

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Appointment(long id, String name, String email, String doctername, String department, String date,
			String slot, int age, String gender, String address, long phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.doctername = doctername;
		this.department = department;
		this.date = date;
		this.slot = slot;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public long getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



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

	public String getDoctername() {
		return doctername;
	}

	public void setDoctername(String doctername) {
		this.doctername = doctername;
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

}
