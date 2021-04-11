package com.newlife.hospital.management;

import static org.assertj.core.api.Assertions.assertThat;

import java.text.ParseException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.newlife.hospital.management.model.Appointment;
import com.newlife.hospital.management.model.Lab;

import com.newlife.hospital.management.repositary.LabRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class LabRepositoryTest {
	@Autowired
	private TestEntityManager entityManager;
	@Autowired
	private LabRepository repo3;
	@Test
	public void testCreateLab() throws ParseException {
			
		Lab l=new Lab();
		l.setTestname("blood test");
		l.setDate("22022020");
		l.setEmail("raj@gmail.com");
		l.setName("raj");
		l.setSlot("evening");
	
		
		
		

		Lab savedUser = repo3.save(l);

		Lab existUser = entityManager.find(Lab.class, savedUser.getId());

		assertThat(l.getEmail()).isEqualTo(existUser.getEmail());
		
		
		
		
	}
}
