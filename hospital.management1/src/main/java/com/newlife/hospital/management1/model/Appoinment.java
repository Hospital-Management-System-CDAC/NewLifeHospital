package com.newlife.hospital.management1.model;





import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name = "Appoinment")
public class Appoinment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	@Column(nullable = false,  length = 45)
    private String doctername;
	@Column(nullable = false, length = 64)
    private String department;
	@Column(nullable = false, length = 64)
	private  String date;
//    @Temporal(TemporalType.TIMESTAMP)
//    @Column(name = "appDate", columnDefinition = "DATETIME")
//    private Date appoinmentDate;
	
	public long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Appoinment [id=" + id + ", doctername=" + doctername + ", department=" + department + ", date=" + date
				+ "]";
	}
	public Appoinment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Appoinment(long id, String doctername, String department, String date) {
	super();
	this.id = id;
	this.doctername = doctername;
	this.department = department;
	this.date = date;
}
	public void setId(long id) {
		this.id = id;
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
	
    
	
}
