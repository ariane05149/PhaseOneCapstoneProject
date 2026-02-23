//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UniversityManager manager = new UniversityManager();

        Student s1 = new UndergraduateStudent("Ali","1","S1",3.8,"CS");
        Student s2 = new UndergraduateStudent("Sara","2","S2",3.2,"IT");

        Course c1 = new Course("CS101","Java",3);

        manager.registerStudent(s1);
        manager.registerStudent(s2);
        manager.createCourse(c1);

        manager.enrollStudentInCourse(s1, c1);
        manager.enrollStudentInCourse(s2, c1);

        manager.generateDeansList();
        }
    }
