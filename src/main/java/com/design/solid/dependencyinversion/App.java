package com.design.solid.dependencyinversion;

public class App {

    public static void main(String[] args) {

        DatabaseHandler databaseHandler = new DatabaseHandler(new OracleDatabse());
        databaseHandler.connect();
        databaseHandler.disconnect();
    }
}
