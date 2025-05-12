package com.kjcourse.model;

public class Course {
	
	// Private instance variables
    private String courseCode;
    private String courseName;
    private int maxCapacity;
    private int currentEnrollment;
    private static int totalEnrolledStudents = 0; // Static variable to track total students enrolled across all courses

 // Constructor to initialize course data
    public Course(String code, String name, int capacity) {
        courseCode = code;
        courseName = name;
        maxCapacity = capacity;
        currentEnrollment = 0;
    }
    
 // Getter for courseCode
    public String getCourseCode() {
        return courseCode;
    }

    // Getter for courseName
    public String getCourseName() {
    	return courseName;
    }

    // Getter for maxCapacity
    public int getMaxCapacity() {
    	return maxCapacity;
    }

    // Getter for current enrollment in this course
    public int getCurrentEnrollment() {
    	return currentEnrollment;
    }
    
 // Method to increment enrollment count for this course
    public void incrementCurrentEnrollment() {
    	
        if (currentEnrollment < maxCapacity) {
        	currentEnrollment = currentEnrollment + 1;
            totalEnrolledStudents = totalEnrolledStudents + 1;
        } else {
        	System.out.println("Cannot enroll: Maximum capacity reached.");
        }
    }
    
 // Static method to return total enrolled students across all courses
    public static int getTotalEnrolledStudents() {
        return totalEnrolledStudents;
    }
}
