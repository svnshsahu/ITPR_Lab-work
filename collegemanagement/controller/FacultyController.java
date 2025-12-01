package com.knmodi.college1.controller;

import com.knmodi.college1.model.Faculty;
import com.knmodi.college1.service.FacultyService;
import com.knmodi.college1.service.impl.FacultyServiceImpl;

import java.util.*;

public class FacultyController {

private FacultyService facultyService;
	
	//constructor
	public FacultyController()
	{
		//to initailize service
		facultyService = new FacultyServiceImpl();
	}
	//user interface for registration of new faculty
	public void registerFacultyUI()
	{
		Scanner sc = new Scanner(System.in);
		//input of faculty id
		System.out.print("Enter Faculty id : ");
		String facultyId = sc.nextLine();
		//input of faculty name
		System.out.print("Enter Faculty Name : ");
		String name = sc.nextLine();
		//input of faculty qualification
		System.out.print("Enter Qualification : ");
		String qualification = sc.nextLine();
		//input of faculty status
		System.out.print("Enter Status : ");
		String status = sc.nextLine();
	
		
		//calling register method
		facultyService.registerFaculty(new Faculty(facultyId, name, qualification,status));
		sc.close();
		
	}

}