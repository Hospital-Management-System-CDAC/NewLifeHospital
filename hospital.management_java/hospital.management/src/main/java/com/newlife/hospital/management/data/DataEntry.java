package com.newlife.hospital.management.data;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.newlife.hospital.management.model.Admin;
import com.newlife.hospital.management.repositary.AdminRepository;
@Component
public class DataEntry implements CommandLineRunner{
	 private final AdminRepository repo4;
	 
	public DataEntry(AdminRepository repo4) {
		
		this.repo4 = repo4;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Admin admin=new Admin();
		admin.setUserid("admin123");
		admin.setPassword("123456");
		repo4.save(admin);
	}

}
