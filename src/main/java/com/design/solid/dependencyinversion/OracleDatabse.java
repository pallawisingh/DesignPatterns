package com.design.solid.dependencyinversion;

public class OracleDatabse implements Database{

    @Override
    public void connect() {
        System.out.println("Connecting to a Oracle database");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting to a Oracle database");
    }
}
