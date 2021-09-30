package com.asgh.javasandbox.AbstractFactoryPattern.factory;

import com.asgh.javasandbox.AbstractFactoryPattern.product.database.Database;
import com.asgh.javasandbox.AbstractFactoryPattern.product.deployment.Deployment;
import com.asgh.javasandbox.AbstractFactoryPattern.product.networking.Networking;
import com.asgh.javasandbox.AbstractFactoryPattern.product.storage.CloudStorage;

public interface CloudFactory {
    Deployment createDeploymentService();
    Networking createNetworkingService();
    CloudStorage createCloudStorageService();
    Database createDatabaseService();
}
