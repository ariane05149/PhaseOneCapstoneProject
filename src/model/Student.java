package model;

public class Student extends Person{
    private String studentID;
    private double gpa;
    private String department;

    public Student(String name, String id, String studentID, double gpa, String department) {
        super(name, id);
        this.studentID = studentID;
        this.gpa = gpa;
        this.department = department;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student: "+getName());
    }
}
