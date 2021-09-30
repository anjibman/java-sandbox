package com.asgh.javasandbox.AbstractFactoryPattern.product.storage;

public class AzureDrive implements CloudStorage {
    @Override
    public void save(String data) {
        System.out.println("Save \"" + data + "\" to Azure drive");
    }

    @Override
    public String read() {
        System.out.println("Read from Azure drive");
        return null;
    }
}
