package model;
import java.util.ArrayList;
import java.util.List;

public class Course {
    private String code;
    private String title;
    private int credits;
    private List<Student>roster=new ArrayList<>();

    public Course(String code, String title, int credits) {
        this.code = code;
        this.title = title;
        this.credits = credits;
    }
    public int getCredits(){
        return credits;
    }
    public void addStudent(Student student){
        roster.add(student);
    }
    public List<Student>getRoster() {
        return roster;
    }
    }


