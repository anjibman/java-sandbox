package com.asgh.javasandbox.AbstractFactoryPattern;

import com.asgh.javasandbox.AbstractFactoryPattern.factory.AwsService;
import com.asgh.javasandbox.AbstractFactoryPattern.factory.AzureService;
import com.asgh.javasandbox.AbstractFactoryPattern.factory.CloudFactory;

public class TestClass {
    private static Application configureApplication(String cloudProvider) {
        CloudFactory factory;

        if (cloudProvider.equals("Azure")) {
            factory = new AzureService();
        } else {
            factory = new AwsService();
        }

        return new Application(factory);
    }

    public static void main(String[] args) {
        System.out.println("Going to AWS Cloud ====================>");
        Application appInAWS = configureApplication("AWS");
        appInAWS.goToCloud();

        System.out.println("\nGoing to Azure Cloud ===================>");
        Application appInAzure = configureApplication("Azure");
        appInAzure.goToCloud();
    }
}
