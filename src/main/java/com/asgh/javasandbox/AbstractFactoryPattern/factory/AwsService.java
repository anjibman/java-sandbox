package com.asgh.javasandbox.AbstractFactoryPattern.factory;

import com.asgh.javasandbox.AbstractFactoryPattern.product.database.AmazonAurora;
import com.asgh.javasandbox.AbstractFactoryPattern.product.database.Database;
import com.asgh.javasandbox.AbstractFactoryPattern.product.deployment.CloudFormation;
import com.asgh.javasandbox.AbstractFactoryPattern.product.deployment.Deployment;
import com.asgh.javasandbox.AbstractFactoryPattern.product.networking.AwsElb;
import com.asgh.javasandbox.AbstractFactoryPattern.product.networking.Networking;
import com.asgh.javasandbox.AbstractFactoryPattern.product.storage.AwsS3;
import com.asgh.javasandbox.AbstractFactoryPattern.product.storage.CloudStorage;

public class AwsService implements CloudFactory {

    @Override
    public Deployment createDeploymentService() {
        return new CloudFormation();
    }

    @Override
    public Networking createNetworkingService() {
        return new AwsElb();
    }

    @Override
    public CloudStorage createCloudStorageService() {
        return new AwsS3();
    }

    @Override
    public Database createDatabaseService() {
        return new AmazonAurora();
    }
}
