package com.asgh.javasandbox.factoryPattern.creator;

import com.asgh.javasandbox.factoryPattern.IntegrationPartner;
import com.asgh.javasandbox.factoryPattern.product.ClaasProvider;
import com.asgh.javasandbox.factoryPattern.product.Partner;

public class DeereConsumerIntegration implements IntegrationCreator {
    @Override
    public Partner createPartner(String partnerId) {
        if (IntegrationPartner.FIELDVIEW.getPartnerId().equals(partnerId)) {
            return new ClaasProvider();
        }

        return null;
    }
}
