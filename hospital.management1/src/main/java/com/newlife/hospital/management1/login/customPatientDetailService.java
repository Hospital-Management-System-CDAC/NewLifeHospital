package com.newlife.hospital.management1.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.newlife.hospital.management1.model.Patients;
import com.newlife.hospital.management1.repositary.PatientsRepositary;

public class customPatientDetailService implements UserDetailsService {
    @Autowired 
	private PatientsRepositary repo;
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Patients patient = repo.findByEmail(email);
        if (patient == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new customPatientsDetail(patient);
        
	}

}
