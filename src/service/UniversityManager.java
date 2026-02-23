package service;
import model.*;
import exception.*;

import java.util.ArrayList;
import java.util.List;

public class UniversityManager {
    private List<Student> students = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();

    public void registerStudent(Student student) {
        students.add(student);
    }

    public void createCourse(Course c) {
        courses.add(c);
    }

    public void enrollStudentInCourse(Student stud, Course c)
            throws CourseFullException, StudentAlreadyEnrolledException {
        if (c.getRoster().contains(stud)) {
            throw new StudentAlreadyEnrolledException("The student is already enrolled in this course ");
        }
        if (c.getRoster().size() >= 30) {
            throw new CourseFullException("The course is full!");
        }

        c.addStudent(stud);
        stud.enrollCourse(c);
    }

    public double calculateAverageGPAByDepartment(String departrment) {
        return students.stream()
                .filter(s -> s.getDepartment().equalsIgnoreCase(departrment))
                .mapToDouble(Student::getGpa)
                .average()
                .orElse(0.0);
    }
    public Student findtopStudent(){
        return students.stream()
                .max((s1,s2)->Double.compare(s1.getGpa(),s2.getGpa()))
        .orElse(null);
    }
}