package com.knmodi.college1;

import com.knmodi.college1.controller.CourseController;
import com.knmodi.college1.util.DataBaseUtil;

public class App 
{
    public static void main( String[] args )
    {
    	//to create tables if not exists
    	DataBaseUtil.createTables();
    	
    	//creating object of CourseController
    	new CourseController().registerCourseUI();
    }
}
