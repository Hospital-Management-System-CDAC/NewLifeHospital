package com.newlife.hospital.management.model;


import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "doctorlist")
public class Doctor {
 @Id
 private String doctor;

public String getDoctor() {
	return doctor;
}

public void setDoctor(String doctor) {
	this.doctor = doctor;
}

public Doctor(String doctor) {
	super();
	this.doctor = doctor;
}

public Doctor() {
	super();
	// TODO Auto-generated constructor stub
}


  

}   