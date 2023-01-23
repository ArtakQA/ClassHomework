import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private final String studentId;
    private final List<String> courses;

    public Student (String name, String gender, int age, String studentId) {
        super(name, gender, age);
        this.studentId = studentId;
        this.courses = new ArrayList<>();
    }
    public void addCourses(String course) {
        courses.add(course);
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID - " + studentId);
        System.out.print("Courses - ");
        for (String course : courses) {
            System.out.print(course + " ");
        }
        System.out.println();
    }
}
class DemoStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Allen", "MALE", 25, "S123");
        student1.addCourses("Java");
        student1.addCourses("C++");
        student1.displayInfo();
    }
}
