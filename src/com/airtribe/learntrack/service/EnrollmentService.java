package com.airtribe.learntrack.service;

import java.util.ArrayList;

import com.airtribe.learntrack.entity.Enrollment;

import com.airtribe.learntrack.repository.EnrollmentRepository;

public class EnrollmentService {
	
	EnrollmentRepository EnrollmentRepo = new EnrollmentRepository();

	public void enroll(Enrollment E1) {
		
		EnrollmentRepo.addToRepo(E1);
	}

	public void viewEnrollments(int id) {
		
		ArrayList<Enrollment> obj = EnrollmentRepo.getAllEnrollments();
		if(obj.isEmpty())
			System.out.println("There are no Enrollments to show");
		else 
			{
			for(Enrollment e1 : obj)
			{
				System.out.println(e1.getId());
				System.out.println(e1.getStudentId());
				System.out.println(e1.getCourseId());
				System.out.println(e1.getEnrollmentDate());
				System.out.println(e1.getStatus());
			}
			}
		
	}

	public void updateStatus(int eid, String status) {
		
		ArrayList<Enrollment> obj = EnrollmentRepo.getAllEnrollments();
		if(obj.isEmpty())
			System.out.println("No Enrollments present currently");
		else 
			{
			for(Enrollment e1 : obj)
			{
				if(e1.getId()==eid)
				{
				
				e1.setStatus(status);
				return;
				}
				
			}
			
				System.out.println("No Enrollments present for given id");
				
			}
		
	}

}
