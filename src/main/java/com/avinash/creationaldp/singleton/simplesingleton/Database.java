package com.avinash.creationaldp.singleton.simplesingleton;

public class Database {
    private static Database db;

    private Database(){}

    public static Database getDbInstance() {
        if (db == null) {
            db = new Database();
        }
        return  db;
    }

    public void checkConnection() {
        System.out.println("DB connection successful");
    }
}
