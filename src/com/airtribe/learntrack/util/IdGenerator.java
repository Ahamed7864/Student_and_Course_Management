package com.airtribe.learntrack.util;

public class IdGenerator {
	
	private static int studentIdCounter = 1;
	private static int courseIdCounter = 1;
	private static int EnrollmentIdCounter = 1;
	
	public static int getNextStudentId()
	{
		return studentIdCounter;
	}
	public static void setstudentIdCounter(int IdCounter)
	{
		studentIdCounter = IdCounter;
	}

	
	public static int getNextCourseId()
	{
		return courseIdCounter;
	}
	
	public static void setCourseIdCounter(int IdCounter)
	{
		studentIdCounter = IdCounter;
	}
	
	public static int getNextEnrollmentId()
	{
		return EnrollmentIdCounter;
	}
	
	public static void setEnrollmentCounter(int IdCounter)
	{
		EnrollmentIdCounter = IdCounter;
	}
	

}
