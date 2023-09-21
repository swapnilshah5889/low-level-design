package DesignPatterns.Prototype;

public class Student implements Prototype<Student> {
    private int age;
    private String name;

    public Student() {
    }

    public Student(Student s) {
        this.age = s.age;
        this.name = s.name;
    }


    @Override
    public Student clone() {
        return new Student(this);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
