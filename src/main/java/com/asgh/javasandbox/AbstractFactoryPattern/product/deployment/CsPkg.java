package com.asgh.javasandbox.AbstractFactoryPattern.product.deployment;

public class CsPkg implements Deployment {

    @Override
    public void provision(String stackName) {
        System.out.println("Provision stack \"" + stackName + "\" using Azure CS Package");
    }

    @Override
    public void deProvision(String stackName) {
        System.out.println("De-Provision stack \"" + stackName + "\" using Azure CS Package");
    }
}
