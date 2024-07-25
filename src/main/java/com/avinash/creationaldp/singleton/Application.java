package com.avinash.creationaldp.singleton;

import com.avinash.creationaldp.singleton.threadsafedoublelock.Database;

public class Application {
    public static void main(String[] args) {
        System.out.println("Singleton Design Pattern");
//         Simple Singleton implementation - not thread safe
//        Database db = Database.getDbInstance();
//
//        db.checkConnection();

        // Singleton implemnetation with thread safe, synchronized
//        Thread t1 = new Thread(new DBGetter());
//
//
//        Thread t2 = new Thread(new DBGetter());
//        t1.start();
//        t2.start();

        // Lazy loading with double lock
        Thread t1 = new Thread(new DBGetter());


        Thread t2 = new Thread(new DBGetter());
        t1.start();
        t2.start();


    }

    public static class DBGetter implements Runnable {
        @Override
        public  void run() {
            Database db = Database.getInstance();
            db.checkConnection();
        }
    }
}
