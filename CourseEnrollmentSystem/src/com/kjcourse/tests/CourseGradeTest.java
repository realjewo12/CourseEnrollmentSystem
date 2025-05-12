package com.kjcourse.tests;

import com.kjcourse.model.Course;
import com.kjcourse.model.CourseGrade;

public class CourseGradeTest {
    public static void main(String[] args) {
        Course course = new Course("MATH101", "Calculus", 30);
        CourseGrade gradeEntry = new CourseGrade(course);

        System.out.println("Course Name: " + gradeEntry.getCourse().getCourseName());
        System.out.println("Initial Grade: " + gradeEntry.getGrade());

        gradeEntry.setGrade(85.5f);
        System.out.println("Updated Grade: " + gradeEntry.getGrade());
    }
}
