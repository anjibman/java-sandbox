package com.asgh.javasandbox.factoryPattern.product;

public class ClaasProvider implements Partner {
    @Override
    public void register() {
        System.out.println("Register with CLAAS Provider");
    }

    @Override
    public void connect() {
        System.out.println("Connect with CLAAS Provider");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnect with CLAAS Provider");
    }
}
