package com.knmodi.college1.model;

public class Faculty {
	//to store faculty id
	private String facultyid;
	//to store faculty name
	private String facultyame;
	private String qualifivation;
	private String status;
	
	
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Faculty(String facultyid, String facultyame, String qualifivation, String status) {
		super();
		this.facultyid = facultyid;
		this.facultyame = facultyame;
		this.qualifivation = qualifivation;
		this.status = status;
	}



	public String getFacultyid() {
		return facultyid;
	}
	public void setFacultyid(String facultyid) {
		this.facultyid = facultyid;
	}
	public String getFacultyname() {
		return facultyame;
	}
	public void setFacultyname(String facultyame) {
		this.facultyame = facultyame;
	}
	public String getQualification() {
		return qualifivation;
	}
	public void setQualification(String qualifivation) {
		this.qualifivation = qualifivation;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}



	@Override
	public String toString() {
		return "Faculty [facultyid=" + facultyid
				+ ", facultyname=" + facultyame 
				+ ", qualification=" + qualifivation
				+ ", status=" + status + "]";
	}



	
	
}
