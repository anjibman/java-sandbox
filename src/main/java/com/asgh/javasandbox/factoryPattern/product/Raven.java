package com.asgh.javasandbox.factoryPattern.product;

public class Raven implements Partner {
    @Override
    public void register() {
        System.out.println("Register with Raven");
    }

    @Override
    public void connect() {
        System.out.println("Connect with Raven");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnect with Raven");
    }
}

