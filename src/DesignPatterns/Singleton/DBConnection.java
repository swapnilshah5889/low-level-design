package DesignPatterns.Singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DBConnection {

    private static DBConnection instance;
    private static Lock lock = new ReentrantLock();

    DBConnection() {}

    public static DBConnection getInstance() {
        if(instance == null){
           lock.lock();
           if(instance == null) {
               instance = new DBConnection();
           }
           lock.unlock();
        }
        return instance;
    }
}
