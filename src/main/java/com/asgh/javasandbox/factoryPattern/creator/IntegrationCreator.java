package com.asgh.javasandbox.factoryPattern.creator;

import com.asgh.javasandbox.factoryPattern.product.Partner;

public interface IntegrationCreator {
    Partner createPartner(String partnerId);

}
