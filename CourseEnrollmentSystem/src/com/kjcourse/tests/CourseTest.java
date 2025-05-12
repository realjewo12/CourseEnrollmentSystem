package com.kjcourse.tests;

import com.kjcourse.model.Course;

public class CourseTest {
    public static void main(String[] args) {
        Course javaCourse = new Course("CS101", "Intro to Java", 2);

        System.out.println("Course Code: " + javaCourse.getCourseCode());
        System.out.println("Course Name: " + javaCourse.getCourseName());
        System.out.println("Max Capacity: " + javaCourse.getMaxCapacity());
        System.out.println("Current Enrollment: " + javaCourse.getCurrentEnrollment());

        // Enroll two students
        javaCourse.incrementCurrentEnrollment();
        javaCourse.incrementCurrentEnrollment();
        javaCourse.incrementCurrentEnrollment();  // Should print full message

        System.out.println("Current Enrollment after attempts: " + javaCourse.getCurrentEnrollment());
        System.out.println("Total Enrolled Students (all courses): " + Course.getTotalEnrolledStudents());
    }
}
