import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{
        private final String employeeID;
        private final List<String> subjects;

        public Teacher (String name, String gender, int age, String employeeID) {
            super(name, gender, age);
            this.employeeID = employeeID;
            this.subjects = new ArrayList<>();
        }
        public void addSubjects(String subject) {
            subjects.add(subject);
        }
        public void displayInfo() {
            super.displayInfo();
            System.out.println("EmployeeID - " + employeeID);
            System.out.print("Subject - ");
            for (String subject : subjects) {
                System.out.print(subject + " ");
            }
            System.out.println();
        }
    }
    class DemoTeacher {
        public static void main(String[] args) {
            Teacher teacher1 = new Teacher("Mark", "MALE", 45, "S123");
            teacher1.addSubjects("Java");
            teacher1.addSubjects("C++");
            teacher1.displayInfo();
    }
}
