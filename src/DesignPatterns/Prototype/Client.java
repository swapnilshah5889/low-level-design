package DesignPatterns.Prototype;

import java.awt.*;

public class Client {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(10);
        s1.setName("ABC");

        // Creates a new copy of s1 student
        Student copy = getStudent(s1);
        System.out.println(s1);
        System.out.println(copy);

        MeritStudent ms = new MeritStudent();
        ms.setAge(12);
        ms.setName("DEF");
        ms.setScholarship(5000);

        // copy2 will have the instance of MeritStudent
//        MeritStudent copy2 = (MeritStudent) getStudent(ms);
        Student copy2 = (MeritStudent) getStudent(ms);
        System.out.println(copy2);
        System.out.println(copy2.getName());
//        System.out.println(copy2.getScholarship());
    }

    public static Student getStudent(Student orig) {
        return orig.clone();
    }
}
