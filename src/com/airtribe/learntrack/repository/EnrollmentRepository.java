package com.airtribe.learntrack.repository;

import java.util.ArrayList;


import com.airtribe.learntrack.entity.Enrollment;

public class EnrollmentRepository {
	
static ArrayList<Enrollment> arr = new ArrayList<>();
	
	public void addToRepo(Enrollment obj)
	{
		arr.add(obj);
	}
	public ArrayList<Enrollment> getAllEnrollments()
	{
		return arr;
	}

}
