package com.asgh.javasandbox.AbstractFactoryPattern.product.deployment;

public class CloudFormation implements Deployment {

    @Override
    public void provision(String stackName) {
        System.out.println("Provision stack \"" + stackName + "\" using AWS CloudFormation");
    }

    @Override
    public void deProvision(String stackName) {
        System.out.println("De-Provision stack \"" + stackName + "\" using AWS CloudFormation");
    }
}
