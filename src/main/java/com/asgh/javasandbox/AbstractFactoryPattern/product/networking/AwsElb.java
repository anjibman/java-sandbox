package com.asgh.javasandbox.AbstractFactoryPattern.product.networking;

public class AwsElb implements Networking {
    @Override
    public void setIP() {
        System.out.println("Set IPs for app using AWS ELB");
    }

    @Override
    public void setVPC() {
        System.out.println("Set VPC for app using AWS ELB");
    }

    @Override
    public void setRoute() {
        System.out.println("Set routes for app using AWS ELB");
    }
}
