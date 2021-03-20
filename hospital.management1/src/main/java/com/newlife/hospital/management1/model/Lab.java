package com.newlife.hospital.management1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "lab")
public class Lab {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
     private long id;
	@Column(nullable = false, length = 45)
     private String testname;
	@Column(nullable = false,  length = 45)
     private String date;
	public Lab(long id, String testname, String date) {
		super();
		this.id = id;
		this.testname = testname;
		this.date = date;
	}
	public Lab() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTestname() {
		return testname;
	}
	public void setTestname(String testname) {
		this.testname = testname;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
}
