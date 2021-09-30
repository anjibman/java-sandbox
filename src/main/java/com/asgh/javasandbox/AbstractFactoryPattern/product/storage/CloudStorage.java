package com.asgh.javasandbox.AbstractFactoryPattern.product.storage;

public interface CloudStorage {
    void save(String data);

    String read();
}
