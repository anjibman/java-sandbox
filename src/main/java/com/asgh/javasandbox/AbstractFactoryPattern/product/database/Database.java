package com.asgh.javasandbox.AbstractFactoryPattern.product.database;

public interface Database {
    void create(String data);

    String read(Integer id);

    void update(Integer id, String data);

    void delete(Integer id);
}
