package com.airtribe.learntrack.repository;

import java.util.ArrayList;

import com.airtribe.learntrack.entity.Course;

public class CourseRepository {
	
	static ArrayList<Course> arr = new ArrayList<>();
	
	public void addToRepo(Course obj)
	{
		arr.add(obj);
	}
	public ArrayList<Course> getAllCourses()
	{
		return arr;
	}

}
