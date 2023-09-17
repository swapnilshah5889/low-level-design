package DesignPatterns.Singleton;

public class DBConnThread implements Runnable {

    @Override
    public void run() {
        DBConnection db2 = DBConnection.getInstance();
        System.out.println(db2);
    }
}
