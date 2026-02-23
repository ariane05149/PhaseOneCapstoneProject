package model;

import java.util.Map;

public class Student extends Person{
    private String studentID;
    private double gpa;
    private String department;
    private Map<Course,Double>courseGrades;

    public Student(String name, String id, String studentID, double gpa, String department, Map<Course, Double> courseGrades) {
        super(name, id);
        this.studentID = studentID;
        this.gpa = gpa;
        this.department = department;
        this.courseGrades = courseGrades;
    }
    public void enrollCourse(Course course) {
        courseGrades.put(course, 0.0);
    }
    public Map<Course,Double>getCourseGrades(){
        return courseGrades;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student: "+getName());
    }
}
