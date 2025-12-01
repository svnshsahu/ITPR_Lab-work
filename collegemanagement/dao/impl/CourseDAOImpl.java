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
			stmt.setInt(5, courseData.getMin_enrollment());
			stmt.setInt(6, courseData.getMax_enrollment());
			
			//to execute the query
			insertedRows = stmt.executeUpdate();
		}
		catch(SQLException sqe)
		{
			System.out.println(sqe);
		}
		// TODO Auto-generated method stub
		return insertedRows;
	}

	@Override
	public ArrayList<Course> findAll() {
		//defining an arraylist
		ArrayList<Course> courseList = new ArrayList<>();
		try(Connection con = DataBaseUtil.establishConnection())
		{
			//create statement
			Statement stmt = con.createStatement();
			//query to select data from table
			String sqlQuery = "Select courseid,"
					+"coursename,description,"
					+"duration,min_enrollment,"
					+"max_enrollment from course";
			//to execute the select query
			ResultSet result = stmt.executeQuery(sqlQuery);
			//Creating object of Course
			Course course;
			//fetching data
			while(result.next())
			{
				course = new Course();
				//setting course data
				course.setCourseId(result.getString(1));
				course.setCourseName(result.getString(2));
				course.setDescription(result.getString(3));
				course.setDuration(result.getInt(4));
				course.setMin_enrollment(result.getInt(5));
				course.setMax_enrollment(result.getInt(6));
				//inserting course into arraylist
				courseList.add(course);
			}				
		}
		catch(SQLException sqe)
		{
			System.out.println(sqe);
		}
		
		return courseList;
	}

	@Override
	public Course findByCourseId(String courseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateCourseDuration(String courseId, int duration) {

		int updatedRows = 0;
		try(Connection con =DataBaseUtil.establishConnection())
		{
			//to create reference of preparedStatement interface
			PreparedStatement stmt = con.prepareStatement("update course set duration = ? where courseid = ?");
			//setting query parameters
			stmt.setInt(1, duration);
			stmt.setString(2, courseId);			
			//to execute the query
			updatedRows = stmt.executeUpdate();
		}
		catch(SQLException sqe)
		{
			System.out.println(sqe);
		}
		return updatedRows;
	}

	@Override
	public int delete(String courseId) {

		int deletedRows = 0;
		try(Connection con =DataBaseUtil.establishConnection())
		{
			//to create reference of preparedStatement interface
			PreparedStatement stmt = con.prepareStatement("delete from course where courseid = ? ");
			//setting query parameters
			stmt.setString(1, courseId);
			
			//to execute the query
			deletedRows = stmt.executeUpdate();
		}
		catch(SQLException sqe)
		{
			System.out.println(sqe);
		}
		// TODO Auto-generated method stub
		return deletedRows;
	}
	
}
