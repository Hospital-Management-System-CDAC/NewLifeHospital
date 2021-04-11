package com.newlife.hospital.management1.login;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.newlife.hospital.management1.model.Patients;

public class customPatientsDetail implements UserDetails{
  
	private Patients patient;
	
	public customPatientsDetail(Patients patient) {
		super();
		this.patient = patient;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return patient.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return patient.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	
	 public String getName() {
	        return this.patient.getName();
	    }
	 public String getEmail() {
	        return this.patient.getEmail();
	    }
	 public int getAge() {
	        return this.patient.getAge();
	    }
	 public String getGender() {
	        return this.patient.getGender();
	    }
	 public String getAddress() {
	        return this.patient.getAddress();
	    }
	 public long getPhoneNumber() {
	        return this.patient.getPhoneNumber();
	    }
}
