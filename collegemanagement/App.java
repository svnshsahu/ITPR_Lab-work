package com.knmodi.college1;

import com.knmodi.college1.dao.impl.CourseDAOImpl;
import com.knmodi.college1.model.Course;
import com.knmodi.college1.util.DataBaseUtil;

public class App 
{
    public static void main( String[] args )
    {
    	//to create tables if not exists
    	DataBaseUtil.createTables();
    	
    	Course course1 = new Course("course102", "ITPR", "Introduction to java programming", 120, 20, 70);
    	CourseDAOImpl cdi = new CourseDAOImpl();
    	int rows = cdi.save(course1);
    	
    	if(rows > 0)
    	{
    		System.out.println("Data inserted");
    	}
    	else
    	{
    		System.out.println("Unable to insert data");
    	}
    }
}
