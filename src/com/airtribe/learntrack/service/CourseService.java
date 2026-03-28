package com.airtribe.learntrack.service;

import java.util.ArrayList;

import com.airtribe.learntrack.entity.Course;

import com.airtribe.learntrack.repository.CourseRepository;


public class CourseService {
	
	CourseRepository courseRepo = new CourseRepository();
	
	public void addCourse(Course course)
	{
		courseRepo.addToRepo(course);
	}
	
	public void removeCourse(int id)
	{
		
		ArrayList<Course> obj = courseRepo.getAllCourses();
		if(obj.isEmpty())
			System.out.println("There are no Courses to remove");
		else 
			{
			for(Course c1 : obj)
			{
				if(c1.getId()==id)
				{
					c1.setActive(false);
					return;
				}
				
				
			}
			System.out.println("no id found");
			}
		
	}
	
	public void removeCourse(String name)
	{
		
		ArrayList<Course> obj = courseRepo.getAllCourses();
				if(obj.isEmpty())
					System.out.println("There are no Courses to remove");
				else 
					{
					for(Course c1 : obj)
					{
						if(c1.getCourseName()==name)
						{
							c1.setActive(false);
							return;
						}
						
						
					}
					System.out.println("no course name found");
					}
	}

	public  void viewCourses() {
		
		
		ArrayList<Course> obj = courseRepo.getAllCourses();
		if(obj.isEmpty())
			System.out.println("There are no courses to show");
		else 
			{
			for(Course c1 : obj)
			{
				if(c1.isActive()==true)
				{
				System.out.println(c1.getId());
				System.out.println(c1.getCourseName());
				System.out.println(c1.getDescription());
				System.out.println(c1.getDurationInWeeks());
				System.out.println(c1.isActive());
				}
			}
				
			}

			
		
			
		
		
		
	}

	public Course searchCourse(int cid) {
		
		ArrayList<Course> obj = courseRepo.getAllCourses();
		if(obj.isEmpty())
			return null;
		else 
			{
			for(Course c1 : obj)
			{
				if(c1.getId()==cid)
				{
				
				return c1;
				}
				
			}
			
				return null;
				
			}
	}
	

}
