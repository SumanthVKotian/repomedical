package com.mindtree.orchard.doctor;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mindtree.orchard.doctorentiy.Doctor;
import com.mindtree.orchard.doctorinterface.DoctorInterface;

@SpringBootTest
class DoctorApplicationTests {
	@Autowired
	private DoctorInterface docserv;
	
	@Test
	public void getAllDoctors() {
		List<Doctor> docs=docserv.getAllDoctors();
		assertThat(docs).size().isGreaterThan(0);
		
	}
	
	@Test
	public void getDoctor() {
		Doctor doc=docserv.getDoctor(1);
		assertEquals("mahesh", doc.getDocName());
	}
	
	@Test
	public void postDoctor() {
		Doctor doc=new Doctor("fahim", 23, "male", "radiologist");
		docserv.addDoctor(doc);
	}
	
	
	
}
