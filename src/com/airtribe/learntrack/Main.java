package com.airtribe.learntrack;


import java.util.Scanner;

import com.airtribe.learntrack.entity.Course;
import com.airtribe.learntrack.entity.Enrollment;
import com.airtribe.learntrack.entity.Student;
import com.airtribe.learntrack.service.CourseService;
import com.airtribe.learntrack.service.EnrollmentService;
import com.airtribe.learntrack.service.StudentService;
import com.airtribe.learntrack.util.IdGenerator;

public class Main {

private static Scanner sc = new Scanner(System.in);
private static StudentService studentService = new StudentService();
private static CourseService courseService = new CourseService();
private static EnrollmentService enrollmentService = new EnrollmentService();

 public static void main(String[] args) {

	        while (true) {
	            System.out.println("\n===== MAIN MENU =====");
	            System.out.println("1. Student Management");
	            System.out.println("2. Course Management");
	            System.out.println("3. Enrollment Management");
	            System.out.println("0. Exit");

	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:studentMenu();
	                case 2:courseMenu();
	                case 3:enrollmentMenu();
	                case 0:{
	                    System.out.println("Exiting...");
	                    return;
	                }
	                default: System.out.println("Invalid choice!");
	            }
	        }
	    }

	    
	    private static void studentMenu() {
	        while (true) {
	            System.out.println("\n--- Student Menu ---");
	            System.out.println("1. Add Student");
	            System.out.println("2. View Students");
	            System.out.println("3. Search Student by ID");
	            System.out.println("4. Deactivate Student");
	            System.out.println("0. Back");

	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:{
	                   
	                    int id = IdGenerator.getNextStudentId();
	                    IdGenerator.setstudentIdCounter(id+1);
	                    

	                    System.out.print("Enter First Name: ");
	                    String first_name = sc.next();
	                    
	                    System.out.print("Enter Last Name: ");
	                    String last_name = sc.next();
	                    
	                    System.out.println("Enter Email");
	                    String email = sc.next();
	                    
	                    System.out.println("Enter Batch");
	                    String batch = sc.next();
	                    
	                    System.out.println("Enter Active");
	                    Boolean active = sc.nextBoolean();

	                    Student s1 = new Student(id, first_name, last_name, email, batch, active);
	                    
	                    studentService.addStudent(s1);break;
	                }

	                case 2:studentService.viewAllStudents();break;

	                case 3:{
	                    System.out.print("Enter ID: ");
	                    int id = sc.nextInt();
	                     Student s1 = studentService.searchStudent(id);
	                     if(s1==null)
	                    	 System.out.println("No students found");
	                     else {
	                    	 System.out.println(s1.getId());
	         				System.out.println(s1.getFirstName());
	         				System.out.println(s1.getLastName());
	         				System.out.println(s1.getBatch());
	         				System.out.println(s1.getEmail());
						}
	                };break;

	                case 4:{
	                    System.out.print("Enter ID: ");
	                    int id = sc.nextInt();
	                    studentService.removeStudent(id);
	                };break;

	                case 0:{ return; }

	                default:System.out.println("Invalid choice!");break;
	            }
	        }
	    }

	    // ---------------- COURSE MENU ----------------
	    private static void courseMenu() {
	        while (true) {
	            System.out.println("\n--- Course Menu ---");
	            System.out.println("1. Add Course");
	            System.out.println("2. View Courses");
	            System.out.println("3. Toggle Course Active Status");
	            System.out.println("0. Back");

	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:{int id = IdGenerator.getNextCourseId();
                    IdGenerator.setCourseIdCounter(id+1);
                    

	                    System.out.print("Enter Course Name: ");
	                    String name = sc.next();sc.next();
	                    
	                    System.out.println("Enter the Description");
	                    String description = sc.next();
	                    
	                    System.out.println("Enter duration in weeks");
	                    int duration = sc.nextInt();
	                    
	                    System.out.println("Enter status of the course");
	                    Boolean status = sc.nextBoolean();
	                    
	                    Course c1 = new Course(id, name, description, duration, status);
	                    

	                    courseService.addCourse(c1);
	                };break;
	                

	                case 2:courseService.viewCourses();break;

	                case 3:{
	                    System.out.print("Enter Course ID: ");
	                    int id2 = sc.nextInt();
	                    courseService.removeCourse(id2);
	                };break;

	                case 0:{ return; }

	                default:System.out.println("Invalid choice!");break;
	            }
	        }
	    }

	    // ---------------- ENROLLMENT MENU ----------------
	    private static void enrollmentMenu() {
	        while (true) {
	            System.out.println("\n--- Enrollment Menu ---");
	            System.out.println("1. Enroll Student");
	            System.out.println("2. View Student Enrollments");
	            System.out.println("3. Update Enrollment Status");
	            System.out.println("0. Back");

	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:{
	                	int id = IdGenerator.getNextEnrollmentId();
	                	IdGenerator.setEnrollmentCounter(id+1);
	                    System.out.print("Enter Student ID: ");
	                    int sid = sc.nextInt();

	                    System.out.print("Enter Course ID: ");
	                    int cid = sc.nextInt();
	                    
	                    System.out.println("Enter Enrollment Date");
	                    String date = sc.next();
	                    
	                    System.out.println("Enter status of Enrollment");
	                    String status = sc.next();

	                    Student s1 = studentService.searchStudent(sid);
	                    Course c1 = courseService.searchCourse(cid);
	                    if(s1==null || c1 == null)
	                    	System.out.println("Can't find the student id or course id");
	                    else {
							
	                    	Enrollment enroll = new Enrollment(id, sid, cid, date, date);
	                    	enrollmentService.enroll(enroll);
						}
	                };break;

	                case 2:{
	                    System.out.print("Enter Student ID: ");
	                    int sid = sc.nextInt();

	                    enrollmentService.viewEnrollments(sid);
	                };break;

	                case 3:{
	                    System.out.print("Enter Enrollment ID: ");
	                    int eid = sc.nextInt();
	                    sc.nextLine();

	                    System.out.print("Enter Status (COMPLETED/CANCELLED): ");
	                    String status = sc.next();

	                    enrollmentService.updateStatus(eid, status);
	                };break;

	                case 0:{ return; }

	                default:System.out.println("Invalid choice!");break;
	            }
	        }
	    }
	}
