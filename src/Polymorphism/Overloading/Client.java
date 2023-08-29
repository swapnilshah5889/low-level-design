package Polymorphism.Overloading;

public class Client {

    void fun() {
        System.out.println("Fun with no arguments");
    }

    void fun(int x) {
        System.out.println("fun(int)");
        System.out.println(x);
    }

    void fun(String x) {
        System.out.println("fun(String)");
        System.out.println(x);
    }

    void fun(String x, int y) {
        System.out.println("fun(String, int)");
        System.out.println(x);
        System.out.println(y);
    }


    void fun(int y, String x) {
        System.out.println("fun(int, String)");
        System.out.println(y);
        System.out.println(x);
    }

    void fun(int a, int b) {
        System.out.println("fun(int, int)");
        System.out.println(a);
        System.out.println(b);
    }

    // This will give error as the method signatures already contains fun:[int, int]
    // void fun(int i, int j) {}

    // This will give error as the method signatures already contains fun:[String, int]
    // void fun(String p, int m) {}
}
