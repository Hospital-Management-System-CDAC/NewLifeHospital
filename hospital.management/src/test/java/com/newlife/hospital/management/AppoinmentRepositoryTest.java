package com.newlife.hospital.management;

import static org.assertj.core.api.Assertions.assertThat;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.newlife.hospital.management.model.Appointment;
import com.newlife.hospital.management.model.Patients;
import com.newlife.hospital.management.repositary.AppointmentRepository;


@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class AppoinmentRepositoryTest {
	@Autowired
	private TestEntityManager entityManager;
	@Autowired
	private AppointmentRepository repo1;
		@Test
	public void testCreateAppoinment() throws ParseException {
			
		Appointment a=new Appointment();
		a.setDoctorname("ravi");
		a.setDepartment("ortho");
		a.setDate("12022019");
		a.setEmail("rav123@gmail.com");
		a.setName("ravi");
		a.setSlot("evening");

		Appointment savedUser = repo1.save(a);

		Appointment existUser = entityManager.find(Appointment.class, savedUser.getId());

		assertThat(a.getEmail()).isEqualTo(existUser.getEmail());
		
		
	}
}
