package DesignPatterns.Prototype;

public class MeritStudent extends Student {
    private int scholarship;

    MeritStudent() {}

    MeritStudent(MeritStudent ms) {
        super(ms);
        this.scholarship = ms.scholarship;
    }

    @Override
    public MeritStudent clone() {
        return new MeritStudent(this);
    }

    public int getScholarship() {
        return scholarship;
    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }
}
