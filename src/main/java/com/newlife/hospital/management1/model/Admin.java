package com.newlife.hospital.management1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.newlife.hospital.management1.controller.AdminController;
import com.newlife.hospital.management1.repositary.AdminRepository;

@Entity
@Table(name = "doctor")
public class Admin implements ApplicationRunner {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "doctor_generator")
	@SequenceGenerator(name="doctor_generator", sequenceName = "doctor_seq", allocationSize=50)
	private int docid;
	
	@Column(name = "name", nullable = false, length = 20)
	private String dname;
	
	@Column(name = "deptid", nullable = false, length = 20)
	private int deptid;
	
	@Column(name = "deptname", nullable = false, length = 20)
	private String deptname;
	
	@Column(name = "sepciality", nullable = false, length = 20)
	private String spec;

	@Column(nullable = false, length = 64)
	private String password;

	@Column(name = "gender", nullable = false, length = 20)
	private String gender;
	
	@Column(name = "phone", nullable = false, length = 50)
	private long phoneNumber;
	
	
	 public Admin(int docid, String dname, int deptid, String deptname, String spec, String password, String gender,
			long phoneNumber) {
		super();
		this.docid = docid;
		this.dname = dname;
		this.deptid = deptid;
		this.deptname = deptname;
		this.spec = spec;
		this.password = password;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
	}

	
	public Admin() {
		super();
	}


	public int getDocid() {
		return docid;
	}

	public void setDocid(int docid) {
		this.docid = docid;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getSpec() {
		return spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Admin [docid=" + docid + ", dname=" + dname + ", deptid=" + deptid + ", deptname=" + deptname
				+ ", spec=" + spec + ", password=" + password + ", gender=" + gender + ", phoneNumber=" + phoneNumber
				+ "]";
	}


		
		
		
	@Override
	public void run(ApplicationArguments args) throws Exception {


		System.out.println("This is working");
		
	
		
	}
		
	

	
	
}
