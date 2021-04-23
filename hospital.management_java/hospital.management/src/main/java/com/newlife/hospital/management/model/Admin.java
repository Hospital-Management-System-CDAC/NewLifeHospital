package com.newlife.hospital.management.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Admin {
	@Id
private String userid;
private String password;
public String getUserid() {
	return userid;
}
public void setUserid(String userid) {
	this.userid = userid;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Admin(String userid, String password) {
	super();
	this.userid = userid;
	this.password = password;
}
public Admin() {
	super();
	// TODO Auto-generated constructor stub
}

}
