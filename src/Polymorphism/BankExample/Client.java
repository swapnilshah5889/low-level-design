package Polymorphism.BankExample;

public class Client {

    static void calculateInterest(int type) {
        BankAccount obj;
        if(type==0) {
            obj = new Savings();
        }
        else if(type==1) {
            obj = new Checking();
        }
        else {
            obj = new Current();
        }
        // Will call the function from the class of instance
        obj.calculateInterest();
    }

    public static void main(String[] args) {
        calculateInterest(0);
        calculateInterest(1);
        calculateInterest(2);
    }
}
