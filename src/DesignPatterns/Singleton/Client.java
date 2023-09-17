package DesignPatterns.Singleton;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        DBConnection db1 = DBConnection.getInstance();
        Thread t1 = new Thread(new DBConnThread());
        Thread t2 = new Thread(new DBConnThread2());
        t1.start();
        t2.start();

        // When debugging the db1, db2 and db3, all three will have the same object instance.
        t1.join();
        t2.join();

        System.out.println(db1);
    }

}
