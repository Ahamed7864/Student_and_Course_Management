package com.airtribe.learntrack.repository;

import java.util.ArrayList;

import com.airtribe.learntrack.entity.Student;

public class StudentRepository {
	
static ArrayList<Student> arr = new ArrayList<>();
	
	public void addToRepo(Student obj)
	{
		arr.add(obj);
	}
	public ArrayList<Student> getAllStudents()
	{
		return arr;
	}

}
