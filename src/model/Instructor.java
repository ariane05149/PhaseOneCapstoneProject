package model;

public class Instructor extends Person {
    private String department;
    private double salary;

    public Instructor(String name, String id, String department, double salary) {
        super(name, id);
        this.department = department;
        this.salary = salary;
    }

    @Override
    public void displayInfo() {
        System.out.println("Instructor Name: " + getName());
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}



