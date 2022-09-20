package com.mindtree.orchard.patiententity;

import java.util.List;

public class OutputPatientAndTheirInfo {
	
	
	private String name;
	private Integer patage;
	
	private List<Visdp> listOfVisit;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Visdp> getListOfVisit() {
		return listOfVisit;
	}
	public void setListOfVisit(List<Visdp> listOfVisit) {
		this.listOfVisit = listOfVisit;
	}
	public OutputPatientAndTheirInfo(String name,Integer patage,  List<Visdp> listOfVisit) {
		super();
		this.name = name;
		this.listOfVisit = listOfVisit;
		this.patage=patage;
	}
	public Integer getPatage() {
		return patage;
	}
	public void setPatage(Integer patage) {
		this.patage = patage;
	}
	public OutputPatientAndTheirInfo() {
		super();
	}
	
	
	
}
