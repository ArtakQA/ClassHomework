enum Gender {
    MALE, FEMALE
}
public class Person {
    private final String Name;
    private final int Age;
    private final Gender  gender;

    public Person (String name, String gender, int age) {
        this.Name = name;
        this.Age = age;
        this.gender =  Gender.valueOf(gender);
    }

    public void displayInfo() {
        System.out.println("Name - " + Name);
        System.out.println("Age - " + Age);
        System.out.println("gender - " + gender);
    }
}
class Demo1 {
    public static void main(String[] args) {
        Person p = new Person("Alen", "MALE", 25);
        p.displayInfo();
    }
}
