package com.knmodi.college1.dao;
import com.knmodi.college1.model.Course;
import java.util.ArrayList;
public interface CourseDAO 
{
	//method for inserting new course data
	int save(Course courseData);
	
	//method to fetch all course list
	ArrayList<Course> findAll();
	
	//method to fetch a particular course
	Course findByCourseId(String courseId);
	
}
