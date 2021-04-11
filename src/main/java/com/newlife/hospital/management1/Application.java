package com.newlife.hospital.management1;



import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.newlife.hospital.management1.model.Admin;




@SpringBootApplication
public class Application {

	


public static void main(String[] args) {
		

		SpringApplication.run(Application.class, args);
	

}


@Bean
	public Admin getAdmin() {
		
		return new Admin(0, null, 0, null, null, null, null, 0);
		
	}




}
