package com.kjcourse.tests;

import com.kjcourse.model.Course;
import com.kjcourse.model.Student;
import com.kjcourse.model.CourseGrade;

public class StudentTest {
    public static void main(String[] args) {
        Course course1 = new Course("CS201", "Data Structures", 1);
        Course course2 = new Course("CS301", "Algorithms", 2);

        Student student = new Student("S001", "Alice");

        student.enrollInCourse(course1);  // Should succeed
        student.enrollInCourse(course1);  // Already enrolled
        student.enrollInCourse(course2);  // Should succeed

        student.assignGrade(course1, 90.0f);
        student.assignGrade(course2, 87.5f);

        for (CourseGrade cg : student.getEnrolledCourses()) {
            System.out.println("Course: " + cg.getCourse().getCourseName() + ", Grade: " + cg.getGrade());
        }

        Course unknown = new Course("CS999", "Quantum Computing", 5);
        student.assignGrade(unknown, 70);  // Not enrolled
    }
}
