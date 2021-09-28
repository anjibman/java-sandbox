package com.asgh.javasandbox.factoryPattern.creator;

import com.asgh.javasandbox.factoryPattern.IntegrationPartner;
import com.asgh.javasandbox.factoryPattern.product.ClaasProvider;
import com.asgh.javasandbox.factoryPattern.product.Partner;
import com.asgh.javasandbox.factoryPattern.product.Raven;

public class CustomIntegration implements IntegrationCreator {
    @Override
    public Partner createPartner(String partnerId) {
        if (IntegrationPartner.RAVEN.getPartnerId().equals(partnerId)) {
            return new Raven();
        } else if (IntegrationPartner.RAZOR.getPartnerId().equals(partnerId)) {
            return new ClaasProvider();
        }

        return null;
    }
}
