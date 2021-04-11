package com.newlife.hospital.management1.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "patients")
public class Patients {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, unique = true, length = 45)
	private String email;

	@Column(nullable = false, length = 64)
	private String password;

	@Column(name = "name", nullable = false, length = 20)
	private String name;
	
	@Column(name = "age", nullable = false, length = 20)
	private int age;
	
	@Column(name = "gender", nullable = false, length = 20)
	private String gender;
	
	@Column(name = "address", nullable = false, length = 100)
	private String address;
	
	@Column(name = "phone", nullable = false, length = 50)
	private long phoneNumber;
	

	
	public Patients(Long id, String email, String password, String name, int age, String gender, String address,
			long phoneNumber) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.phoneNumber = phoneNumber;
		
	}

		public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	

	public Patients() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Patients [id=" + id + ", email=" + email + ", password=" + password + ", name=" + name + ", age=" + age
				+ ", gender=" + gender + ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
	}



}
