package com.asgh.javasandbox.factoryPattern.product;

public class Razor implements Partner {
    @Override
    public void register() {
        System.out.println("Register with Razor");
    }

    @Override
    public void connect() {
        System.out.println("Connect with Razor");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnect with Razor");
    }
}

