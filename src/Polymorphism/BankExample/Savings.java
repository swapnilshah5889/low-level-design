package Polymorphism.BankExample;

public class Savings extends BankAccount{

    void calculateInterest() {
        System.out.println(super.balance);
        System.out.println("Savings interest");
    }
}
