package com.knmodi.college1.dao;
import com.knmodi.college1.model.Course;
import java.util.ArrayList;
public interface CourseDAO 
{
	//method for inserting new course data
	int save(Course courseData);
	//method for updating duration
	int updateCourseDuration(String courseId,int duration);
	//method to delete the course
	int delete(String courseId);
	
	//method to fetch all course list
	ArrayList<Course> findAll();
	
	//method to fetch a particular course
	Course findByCourseId(String courseId);
	
}
