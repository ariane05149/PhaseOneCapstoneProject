package service;
import model.*;
import exception.*;

import java.util.ArrayList;
import java.util.List;

public class UniversityManager {
    private List<Student>students=new ArrayList<>();
    private List<Course>courses=new ArrayList<>();
    public void registerStudent(Student student){
        students.add(student);
    }
    public void createCourse(Course c){
        courses.add(c);
    }
    public void enrollStudentInCourse(Student stud,Course c)
        throws CourseFullException,StudentAlreadyEnrolledException {
        if (c.getRoster().contains(stud)) {
            throw new StudentAlreadyEnrolledException("The student is already enrolled in this course ");
        }
        if (c.getRoster().size() >= 30) {
            throw new CourseFullException("The course is full!");
        }

        c.addStudent(stud);
        stud.enrollCourse(c);
    }


}
