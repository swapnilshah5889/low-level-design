package Static.Methods;

public class Client {

    public static void main(String[] args) {

        // Custom static method
        int val = CustomMath.abs(-50);
        System.out.println(val);

        // Accessing static variables in non static methods
        Student.schoolName = "DPS";
        Student s1 = new Student(10, "Rahul");
        s1.display();
    }

}
