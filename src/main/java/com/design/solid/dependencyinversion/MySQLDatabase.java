package com.design.solid.dependencyinversion;

public class MySQLDatabase implements Database{

    @Override
    public void connect() {
        System.out.println("Connecting to a MySQL database");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting to a MySQL database");
    }
}
