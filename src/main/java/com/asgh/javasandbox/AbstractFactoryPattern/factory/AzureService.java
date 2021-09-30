package com.asgh.javasandbox.AbstractFactoryPattern.factory;

import com.asgh.javasandbox.AbstractFactoryPattern.product.database.Database;
import com.asgh.javasandbox.AbstractFactoryPattern.product.database.MsSql;
import com.asgh.javasandbox.AbstractFactoryPattern.product.deployment.CsPkg;
import com.asgh.javasandbox.AbstractFactoryPattern.product.deployment.Deployment;
import com.asgh.javasandbox.AbstractFactoryPattern.product.networking.AzureConnect;
import com.asgh.javasandbox.AbstractFactoryPattern.product.networking.Networking;
import com.asgh.javasandbox.AbstractFactoryPattern.product.storage.AzureDrive;
import com.asgh.javasandbox.AbstractFactoryPattern.product.storage.CloudStorage;

public class AzureService implements CloudFactory {
    @Override
    public Deployment createDeploymentService() {
        return new CsPkg();
    }

    @Override
    public Networking createNetworkingService() {
        return new AzureConnect();
    }

    @Override
    public CloudStorage createCloudStorageService() {
        return new AzureDrive();
    }

    @Override
    public Database createDatabaseService() {
        return new MsSql();
    }
}
