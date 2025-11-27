package com.knmodi.college1.dao.impl;

import java.util.ArrayList;

import com.knmodi.college1.dao.CourseDAO;
import com.knmodi.college1.model.Course;
import java.sql.*;
import com.knmodi.college1.util.*;
/*---------------------------------------------------
 * ------- Structure Of the Course ---------
 * table : course
 * --------------------------------------
 * fields - data type - 
 * courseid - varchar(30) - primary key
 * coursename - varchar(300) - not null 
 * description - varchar(1000) - not null
 * duration - int - not null
 * min_enrollment - int - not null 
 * max_enrollment - int  - not null
 * */
public class CourseDAOImpl implements CourseDAO
{

	@Override
	public int save(Course courseData) 
	{
		int insertedRows = 0;
		try(Connection con =DataBaseUtil.establishConnection())
		{
			//to create reference of preparedStatement interface
			PreparedStatement stmt = con.prepareStatement("insert into course values(?,?,?,?,?,?)");
			//setting query parameters
			stmt.setString(1, courseData.getCourseId());
			stmt.setString(2, courseData.getCourseName());
			stmt.setString(3, courseData.getDescription());
			stmt.setInt(4, courseData.getDuration());
			stmt.setInt(5, courseData.getMinEnrollment());
			stmt.setInt(6, courseData.getMaxEnrollment());
			
			//to execute the query
			insertedRows = stmt.executeUpdate();
		}
		catch(SQLException sqe)
		{
			System.out.println(sqe);
		}
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Course> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course findByCourseId(String courseId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
