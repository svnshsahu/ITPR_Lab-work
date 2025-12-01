package com.knmodi.college1.service;
import  com.knmodi.college1.model.*;
public interface CourseService 
{
	//method to register new course
	void registerCourse(Course course);
	//method to update course duration
	void updateCourseDuration(String courseId,int duration);
	//method to fetch all courses
	void getCourseList();
	//method to fetch course details of a particular course
	void getCourseDetails(String courseId);
	//
	
}
