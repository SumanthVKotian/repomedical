package com.mindtree.orchard.patientservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mindtree.orchard.patiententity.Doctor;
import com.mindtree.orchard.patiententity.OutputPatientAndTheirInfo;
import com.mindtree.orchard.patiententity.Patient;
import com.mindtree.orchard.patiententity.Visdp;
import com.mindtree.orchard.patientinterface.PatientInterface;
import com.mindtree.orchard.patientrepository.PatientRepository;


@Service
public class PatientService implements PatientInterface {
	
	@Autowired
	private PatientRepository patientrepo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	
	@Override
	public List<Patient> getAllPatient() {
		// TODO Auto-generated method stub
		return patientrepo.findAll();
	}

	@Override
	public Patient getPatient(Integer id) {
		// TODO Auto-generated method stub
		List<Patient> s = patientrepo.findByPatid(id);
		return s.get(0);
	}

	@Override
	public OutputPatientAndTheirInfo getVisitDetails(Integer id) {
		// TODO Auto-generated method stub
		List<Visdp> sts=new ArrayList<>();
		List<Patient> pat=patientrepo.findByPatid(id);
		for(int i=0;i<pat.size();i++) {
			 Doctor d=restTemplate.getForObject("http://doctor/doctor/"+pat.get(i).getDocvisited(), Doctor.class);
			 sts.add(new Visdp(pat.get(i).getDocvisited(),d.getDocName(),pat.get(i).getPrescription(),pat.get(i).getDate()));
		}
		OutputPatientAndTheirInfo o= new OutputPatientAndTheirInfo(pat.get(0).getPatname(),pat.get(0).getPatage(), sts);
		return o;
	}

	@Override
	public void addPatient(Patient p) {
		// TODO Auto-generated method stub
		patientrepo.save(p);
	}

	@Override
	public void updatePatient(Patient p) {
		// TODO Auto-generated method stub
		patientrepo.save(p);
	}

	@Override
	public void deletePatientById(Integer pid) {
		// TODO Auto-generated method stub
		patientrepo.deleteByPatid(pid);
	}

	@Override
	public void deletePatientVist(Integer id) {
		// TODO Auto-generated method stub
		patientrepo.deleteById(id);
	}

	@Override
	public List<Patient> getAllPatientBasedOnDoc(Integer id) {
		
		return patientrepo.findByDocvisited(id);
	}

}
