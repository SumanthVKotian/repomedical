package com.mindtree.orchard.patientinterface;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.orchard.patiententity.OutputPatientAndTheirInfo;
import com.mindtree.orchard.patiententity.Patient;
import com.mindtree.orchard.patiententity.Visdp;



@Service
public interface PatientInterface {
	
	public List<Patient> getAllPatient();
	public Patient getPatient(Integer id);
	public OutputPatientAndTheirInfo getVisitDetails(Integer id);
	public List<Patient> getAllPatientBasedOnDoc(Integer id);
	public void addPatient(Patient p);
	public void updatePatient(Patient p);
	public void deletePatientById(Integer pid);
	public void deletePatientVist(Integer id);
}
