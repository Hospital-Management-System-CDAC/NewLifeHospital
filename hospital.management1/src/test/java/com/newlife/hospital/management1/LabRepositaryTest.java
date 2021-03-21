package com.newlife.hospital.management1;

import java.text.ParseException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;


import com.newlife.hospital.management1.model.Lab;

import com.newlife.hospital.management1.repositary.LabRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class LabRepositaryTest {
	@Autowired
	private TestEntityManager entityManager;
	@Autowired
	private LabRepository repo3;
	@Test
	public void testCreateLab() throws ParseException {
			
		Lab l=new Lab();
		l.setTestname("blood test");
		
		
		l.setDate("12022019");
		

		Lab savedUser = repo3.save(l);
		
		
		
		
	}
}
