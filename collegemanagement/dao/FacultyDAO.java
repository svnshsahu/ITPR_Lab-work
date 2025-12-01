package com.knmodi.college1.dao;
import com.knmodi.college1.model.Faculty;
import java.util.ArrayList;
public interface FacultyDAO 
{
	//method for inserting new faculty data
	int save(Faculty facultyData);
	
	//method to fetch all faculty list
	ArrayList<Faculty> findAll();
	
	//method to fetch a particular faculty
	Faculty findByFacultyId(String FacultyId);
	
	public int updateFacultyStatusByFacultyId(String facultyId, String status);
	
	public int delete(String facultyId);
	
}
