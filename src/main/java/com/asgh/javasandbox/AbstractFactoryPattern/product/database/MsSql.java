package com.asgh.javasandbox.AbstractFactoryPattern.product.database;

import com.asgh.javasandbox.AbstractFactoryPattern.product.database.Database;

public class MsSql implements Database {

    @Override
    public void create(String data) {
        System.out.println("Create record { " + data + " } in MS SQL DB");
    }

    @Override
    public String read(Integer id) {
        System.out.println("Read record [" + id + "] from MS SQL DB");
        return null;
    }

    @Override
    public void update(Integer id, String data) {
        System.out.println("Update record for [" + id + "] with { " + data + " } in MS SQL DB");
    }

    @Override
    public void delete(Integer id) {
        System.out.println("Delete record [" + id + "] from MS SQL DB");
    }
}
