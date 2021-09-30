package com.asgh.javasandbox.AbstractFactoryPattern.product.database;

public class AmazonAurora implements Database {

    @Override
    public void create(String data) {
        System.out.println("Create record { " + data + " } in Amazon Aurora DB");
    }

    @Override
    public String read(Integer id) {
        System.out.println("Read record [" + id + "] from Amazon Aurora DB");
        return null;
    }

    @Override
    public void update(Integer id, String data) {
        System.out.println("Update record for [" + id + "] with { " + data + " } in Amazon Aurora DB");
    }

    @Override
    public void delete(Integer id) {
        System.out.println("Delete record [" + id + "] in Amazon Aurora DB");
    }
}
