package Inheritance.BasicOverriding;

public class Client {

    public static void main(String[] args) {

        // Child can access all data members are methods of parent
        Child c = new Child();
        c.d1=0;
        c.display();
        c.d2 = 2;

        // Child fun will be called as it will override the fun
        // Function of parent
        c.fun();

        Parent p = new Child();
        p.fun();
    }
}
