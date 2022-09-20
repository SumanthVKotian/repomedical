package com.mindtree.orchard.patiententity;

import java.sql.Date;

public class Visdp {
	
	
	private Integer visdoc;
	private String visdocname;
	private String prescription;
	private java.util.Date date;
	public Visdp(Integer visdoc, String visdocname, String prescription, java.util.Date date) {
		super();
		this.visdoc = visdoc;
		this.visdocname = visdocname;
		this.prescription = prescription;
		this.date = date;
	}
	public Visdp() {
		super();
	}
	public Integer getVisdoc() {
		return visdoc;
	}
	public void setVisdoc(Integer visdoc) {
		this.visdoc = visdoc;
	}
	public String getVisdocname() {
		return visdocname;
	}
	public void setVisdocname(String visdocname) {
		this.visdocname = visdocname;
	}
	public String getPrescription() {
		return prescription;
	}
	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}
	public java.util.Date getDate() {
		return date;
	}
	public void setDate(java.util.Date date) {
		this.date = date;
	}
	
	
	
	
}
