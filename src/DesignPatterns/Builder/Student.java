package DesignPatterns.Builder;

public class Student {

    private String name;
    private int age;
    private String uniName;
    private String id;
    private String studentClass;
    private String studentGrade;

    private Student() {}



    public Student(StudentBuilder sb) {
        this.name = sb.name;
        this.age = sb.age;
        this.uniName = sb.uniName;
        this.id = sb.id;
        this.studentClass = sb.studentClass;
        this.studentGrade = sb.studentGrade;
    }

    public static StudentBuilder getStudentBuildr() {
        return new StudentBuilder();
    }

    public static class StudentBuilder {

        private String name;
        private int age;
        private String uniName;
        private String id;
        private String studentClass;
        private String studentGrade;

        public String getName() {
            return name;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getUniName() {
            return uniName;
        }

        public StudentBuilder setUniName(String uniName) {
            this.uniName = uniName;
            return this;
        }

        public String getId() {
            return id;
        }

        public StudentBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public String getStudentClass() {
            return studentClass;
        }

        public StudentBuilder setStudentClass(String studentClass) {
            this.studentClass = studentClass;
            return this;
        }

        public String getStudentGrade() {
            return studentGrade;
        }

        public StudentBuilder setStudentGrade(String studentGrade) {
            this.studentGrade = studentGrade;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getUniName() {
        return uniName;
    }

    public String getId() {
        return id;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public String getStudentGrade() {
        return studentGrade;
    }
}
