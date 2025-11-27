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
	public String getFacultyame() {
		return facultyame;
	}
	public void setFacultyame(String facultyame) {
		this.facultyame = facultyame;
	}
	public String getQualifivation() {
		return qualifivation;
	}
	public void setQualifivation(String qualifivation) {
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
				+ ", facultyame=" + facultyame 
				+ ", qualifivation=" + qualifivation
				+ ", status=" + status + "]";
	}



	
	
	
	
	
	
}
