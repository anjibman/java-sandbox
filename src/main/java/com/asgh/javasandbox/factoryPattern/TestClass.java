package com.asgh.javasandbox.factoryPattern;

import com.asgh.javasandbox.factoryPattern.creator.*;
import com.asgh.javasandbox.factoryPattern.product.Partner;

public class TestClass {
    public static void main(String[] args) {
        IntegrationCreator creator;

        for (IntegrationPartner integrationPartner : IntegrationPartner.values()) {
            System.out.println("----------> integrationPartnerId = " + integrationPartner.getPartnerId());
            if (integrationPartner.getPartnerType().equals(IntegrationType.DATA_CONNECT_CONSUMER)) {
                creator = new DataConnectConsumerIntegration();
            } else if (integrationPartner.getPartnerType().equals(IntegrationType.DATA_CONNECT_PROVIDER)) {
                creator = new DataConnectProviderIntegration();
            } else if (integrationPartner.getPartnerType().equals(IntegrationType.DEERE_CONSUMER)) {
                creator = new DeereConsumerIntegration();
            } else {
                creator = new CustomIntegration();
            }

            Partner partner = creator.createPartner(integrationPartner.getPartnerId());
            partner.register();
            partner.connect();
            partner.disconnect();
        }
    }
}
