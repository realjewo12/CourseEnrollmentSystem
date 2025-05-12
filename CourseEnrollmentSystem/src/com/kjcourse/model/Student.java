package com.kjcourse.model;

import java.util.ArrayList;

public class Student {

	// Private instance variables
    private String studentId;
    private String name;
    private ArrayList<CourseGrade> enrolledCourses;  // List of course-grade pairs

    // Constructor
     public Student(String id, String name) {
        this.studentId = id;
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }
     
    // Enroll in a course
     public void enrollInCourse(Course c) {
         if (! alreadyEnrolled(c)) {
        	 if (c.getCurrentEnrollment() < c.getMaxCapacity()) {
        		 enrolledCourses.add(new CourseGrade(c));
                 c.incrementCurrentEnrollment(); 
        	 } else {
        		 System.out.println("Course full");
        	 }
         } else {
        	 System.out.println("Already enrolled in this course");		
         } 
     }
     
     // Assign a grade for a specific course
     public void assignGrade(Course c, float grade) {
    	 
         for (CourseGrade cg : enrolledCourses) {
        	 if (cg.getCourse().equals(c)) {
        		 cg.setGrade(grade);
        		 return;
        	 }
         }
 
         System.out.println("Cannot assign grade: Not enrolled in this course");
     }
     
     // Check if already enrolled in a course
     private boolean alreadyEnrolled(Course c) {
         for (CourseGrade cg : enrolledCourses) {
        	 if (cg.getCourse().equals(c)) {
        		 return true;
        	 }
         }
         return false;
     }
     
     // Getters and setters for name and ID
     public String getStudentId() {
         return studentId;
     }

     public String getName() {
    	 return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public void setStudentId(String id) {
         this.studentId = id;
     }

     // Method to get grades or enrolled courses
     public ArrayList<CourseGrade> getEnrolledCourses() {
         return enrolledCourses;
     }
	/*
    

   
    
}
*/
}
