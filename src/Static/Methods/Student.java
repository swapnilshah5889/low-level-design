package Static.Methods;

public class Student {
    int age;
    String name;
    static String schoolName;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void display() {
        System.out.println("Name: "+name);
        // Non static methods can access static data members
        System.out.println("School: "+schoolName);
    }
}
