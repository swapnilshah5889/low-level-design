package DesignPatterns.Singleton;

public class DBConnThread2 implements Runnable {
    @Override
    public void run() {
        DBConnection db3 = DBConnection.getInstance();
        System.out.println(db3);
    }
}
