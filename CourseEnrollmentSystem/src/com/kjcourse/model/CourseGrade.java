package com.kjcourse.model;

public class CourseGrade {

	private Course course;
	private Float grade;  // Nullable: can be null if not yet assigned

	// Constructor for course with no grade initially
	public CourseGrade(Course course) {
        this.course = course;
        this.grade = null;
    }
	
	// Constructor with initial grade
	public CourseGrade(Course course, Float grade) {
        this.course = course;
        this.grade = grade;
    }
	
	// Getter for the course
    public Course getCourse() {
        return course;
    }

    // Getter for the grade
    public Float getGrade() {
        return grade;
    }

    // Setter for the grade
    public void setGrade(Float grade) {
        this.grade = grade;
    }
}
