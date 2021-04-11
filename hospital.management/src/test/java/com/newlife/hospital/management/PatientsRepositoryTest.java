package com.newlife.hospital.management;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.newlife.hospital.management.model.Patients;
import com.newlife.hospital.management.repositary.PatientsRepository;





@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class PatientsRepositoryTest {
	@Autowired
	private TestEntityManager entityManager;
	@Autowired
	private PatientsRepository repo;
//	@Test
//	public void testCreatePatients() {
//		Patients p=new Patients();
//		p.setEmail("ravi12345@gmail.com");
//		p.setPassword("123456");
//		p.setName("ravi");
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
		String email = "ravi12345@gmail.com";
		Patients patient = repo.findById(email);

		assertThat(patient.getEmail()).isEqualTo(email);
	}
}