package com.newlife.hospital.management1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.newlife.hospital.management1.model.Patients;
import com.newlife.hospital.management1.repositary.PatientsRepositary;





@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class PatientsRepositaryTest {
	@Autowired
	private TestEntityManager entityManager;
	@Autowired
	private PatientsRepositary repo;
//	@Test
//	public void testCreatePatients() {
//		Patients p=new Patients();
//		p.setEmail("radedewwj@gmail.com");
//		p.setPassword("1ddw2abs");
//		p.setName("rddawj");
//		p.setAge(22);
//		p.setGender("M");
//		p.setAddress("bangalore");
//		p.setPhoneNumber(9892);
//
//		Patients savedUser = repo.save(p);
//		
//		Patients existUser = entityManager.find(Patients.class, savedUser.getId());
//		
//		assertThat(p.getEmail()).isEqualTo(existUser.getEmail());
//	}

	@Test
	public void testFindByEmail() {
		String email = "radedej@gmail.com";
		Patients patient = repo.findByEmail(email);
		
		assertThat(patient.getEmail()).isEqualTo(email);
	}
}
