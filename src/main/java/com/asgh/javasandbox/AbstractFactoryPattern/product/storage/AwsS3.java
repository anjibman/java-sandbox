package com.asgh.javasandbox.AbstractFactoryPattern.product.storage;

public class AwsS3 implements CloudStorage {
    @Override
    public void save(String data) {
        System.out.println("Save \"" + data + "\" to AWS S3 bucket");
    }

    @Override
    public String read() {
        System.out.println("Read from AWS S3 bucket");
        return null;
    }
}
