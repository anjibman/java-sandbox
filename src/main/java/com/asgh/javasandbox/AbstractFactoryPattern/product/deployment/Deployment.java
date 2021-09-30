package com.asgh.javasandbox.AbstractFactoryPattern.product.deployment;

public interface Deployment {
    void provision(String stackName);

    void deProvision(String stackName);
}
