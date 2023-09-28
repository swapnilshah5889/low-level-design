package DesignPatterns.Builder;

public class Client {

    public static void main(String[] args) {

        Student st = Student.getStudentBuildr()
                .setName("Ankit")
                .setAge(25)
                .setId("sbs34")
                .setStudentClass("9")
                .setStudentGrade("Alpha")
                .build();

        System.out.println(st.getName());
    }

}
