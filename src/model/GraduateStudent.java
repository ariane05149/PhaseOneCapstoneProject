package model;

public class GraduateStudent extends Student {
    private int researchFee=1000;

    public GraduateStudent(String name, String id, String studentID, double gpa, String department, int researchFee) {
        super(name, id, studentID, gpa, department);
        this.researchFee = researchFee;
    }

    @Override
    public double calculateTuition() {
        int totalCredits=0;
        for (Course c : getCourseGrades().keySet()) {
            totalCredits += c.getCredits();
        }
        return (totalCredits * 500) + researchFee;
    }
    }

