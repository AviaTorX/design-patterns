package com.avinash.creationaldp.singleton.threadsafedoublelock;

public class Database {
    private static Database db;

    private Database(){}

    public static Database getInstance() {
        Database result = db;
        if (db != null) {
            return  db;
        }

        synchronized (Database.class) {
            if (db == null) {
                db = new Database();
            }
            return db;
        }

    }

    public void checkConnection() {
        System.out.println("DB connection successful");
    }
}
