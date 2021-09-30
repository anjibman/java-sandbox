package com.asgh.javasandbox.AbstractFactoryPattern.product.networking;

public class AzureConnect implements Networking {
    @Override
    public void setIP() {
        System.out.println("Set IPs for app using Azure Connect");
    }

    @Override
    public void setVPC() {
        System.out.println("Set VPC for app using Azure Connect");
    }

    @Override
    public void setRoute() {
        System.out.println("Set routes for app using Azure Connect");
    }
}
