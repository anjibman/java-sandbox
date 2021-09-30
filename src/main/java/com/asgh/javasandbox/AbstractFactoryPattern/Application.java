package com.asgh.javasandbox.AbstractFactoryPattern;

import com.asgh.javasandbox.AbstractFactoryPattern.factory.CloudFactory;
import com.asgh.javasandbox.AbstractFactoryPattern.product.database.Database;
import com.asgh.javasandbox.AbstractFactoryPattern.product.deployment.Deployment;
import com.asgh.javasandbox.AbstractFactoryPattern.product.networking.Networking;
import com.asgh.javasandbox.AbstractFactoryPattern.product.storage.CloudStorage;

public class Application {
    private final Deployment appDeployment;
    private final Networking appNetworking;
    private final CloudStorage appStorage;
    private final Database appDatabase;

    public Application(CloudFactory factory) {
        appDeployment = factory.createDeploymentService();
        appNetworking = factory.createNetworkingService();
        appStorage = factory.createCloudStorageService();
        appDatabase = factory.createDatabaseService();
    }

    public void goToCloud() {
        appDeployment.provision("My New App");
        appNetworking.setIP();
        appNetworking.setVPC();
        appNetworking.setRoute();
        appStorage.save("sample.jpeg");
        appDatabase.create("1 HelloWorld 09/29/2021");
    }
}
