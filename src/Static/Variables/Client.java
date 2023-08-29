package Static.Variables;

public class Client {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 10;
        s1.name = "ABC";
        Student.schoolName = "DAV";

        Student s2 = new Student();
        s2.age = 20;
        s2.name = "DEF";
        Student.schoolName = "DPS";

        // This will print DPS, as the static variable schoolname was changed by s2
        // that does not belong to that particular object but to the whole class
        System.out.println(s1.schoolName);

    }
}
