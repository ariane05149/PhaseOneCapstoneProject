package model;
import java.util.Map;
import java.util.HashMap;

public class Student extends Person {
    private String studentID;
    private double gpa;
    private String department;
    private Map<Course, Double> courseGrades = new HashMap<>();

    public Student(String name, String id, String studentID, double gpa, String department) {
        super(name, id);
        this.studentID = studentID;
        this.gpa = gpa;
        this.department = department;
    }

    public void enrollCourse(Course course) {
        courseGrades.put(course, 0.0);
    }

    public void assignGrade(Course course, double grade) {
        if (courseGrades.containsKey(course)) {
            courseGrades.put(course, grade);
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Student Name: " + getName());
        System.out.println("Student Id: " + studentID);
        System.out.println("Department: " + department);
        System.out.println("GPA: " + gpa);
    }
}
