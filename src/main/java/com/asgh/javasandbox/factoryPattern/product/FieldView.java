package com.asgh.javasandbox.factoryPattern.product;

public class FieldView implements Partner {
    @Override
    public void register() {
        System.out.println("Register with FieldView");
    }

    @Override
    public void connect() {
        System.out.println("Connect with FieldView");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnect with FieldView");
    }
}
