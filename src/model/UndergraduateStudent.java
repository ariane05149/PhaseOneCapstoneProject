package model;

public class UndergraduateStudent extends Student{
    public UndergraduateStudent(String name, String id, String studentID, double gpa, String department) {
        super(name, id, studentID, gpa, department);
    }

    @Override
    public double calculateTuition() {
        return 3000;
    }
}

