package com.asgh.javasandbox.factoryPattern.creator;

import com.asgh.javasandbox.factoryPattern.IntegrationPartner;
import com.asgh.javasandbox.factoryPattern.product.ClaasConsumer;
import com.asgh.javasandbox.factoryPattern.product.Partner;

public class DataConnectConsumerIntegration implements IntegrationCreator {
    @Override
    public Partner createPartner(String partnerId) {
        if (IntegrationPartner.CLAAS_CONSUMER.getPartnerId().equals(partnerId)) {
            return new ClaasConsumer();
        }

        return null;
    }
}
