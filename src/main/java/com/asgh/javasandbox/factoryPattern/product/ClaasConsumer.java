package com.asgh.javasandbox.factoryPattern.product;

public class ClaasConsumer implements Partner {
    @Override
    public void register() {
        System.out.println("Register with CLAAS Consumer");
    }

    @Override
    public void connect() {
        System.out.println("Connect with CLAAS Consumer");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnect with CLAAS Consumer");
    }
}

