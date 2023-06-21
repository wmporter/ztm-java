package main;

import university.Student;
import university.Course;
import university.Enrollment;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Student s = new Student();
        Course c = new Course();
        Enrollment e = new Enrollment();
        
        s.name = "Yusef";
        s.studentId = 9809;
        c.courseName = "Java";
        c.courseId = 25;
        e.student = s;
        e.course = c;
        
        System.out.println("student name: " + s.name);
        System.out.println("course id: " + c.courseId);
        System.out.println("enrollment course name: " + e.course.courseName);
    }
}
