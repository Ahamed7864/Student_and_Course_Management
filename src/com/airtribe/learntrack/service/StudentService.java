package com.airtribe.learntrack.service;

import java.util.ArrayList;

import com.airtribe.learntrack.entity.Student;
import com.airtribe.learntrack.repository.StudentRepository;

public class StudentService {
	
	
	StudentRepository studentRepo = new StudentRepository();
	
	public void addStudent(Student student)
	{
		studentRepo.addToRepo(student);
	}
	
	public void removeStudent(int id)
	{
		
		ArrayList<Student> obj = studentRepo.getAllStudents();
		if(obj.isEmpty())
			System.out.println("There are no Students to remove");
		else 
			{
			for(Student s1 : obj)
			{
				if(s1.getId()==id)
				{
					s1.setActive(false);
					return;
				}
				
			}
			System.out.println("no id found");
			}

	}
	
	public void removeStudent(String email)
	
	{
		
		ArrayList<Student> obj = studentRepo.getAllStudents();
		if(obj.isEmpty())
			System.out.println("There are no Students to remove");
		else 
			{
			for(Student s1 : obj)
			{
				if(s1.getEmail().equalsIgnoreCase(email))
				{
					s1.setActive(false);
					return;
				}
				
				
			}
			System.out.println("no email found");
			}
		
	}

	public void viewAllStudents() {
		ArrayList<Student> obj = studentRepo.getAllStudents();
		if(obj.isEmpty())
			System.out.println("There are no Students to show");
		else 
			{
			for(Student s1 : obj)
			{
				if(s1.isActive()==true)
				{
				System.out.println(s1.getId());
				System.out.println(s1.getFirstName());
				System.out.println(s1.getLastName());
				System.out.println(s1.getBatch());
				System.out.println(s1.getEmail());
				}
				
			}
			}
	}
				

	public Student searchStudent(int id) {
		
		ArrayList<Student> obj = studentRepo.getAllStudents();
		if(obj.isEmpty())
			return null;
		else 
			{
			for(Student s1 : obj)
			{
				if(s1.getId()==id)
				{
				
				return s1;
				}
				
			}
			
				return null;
				
			}
		
		
	
	
	

	}
}
