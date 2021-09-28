package com.asgh.javasandbox.factoryPattern;

public enum IntegrationPartner {
    CLAAS_PROVIDER  ("7f2d67fa-5226-4fce-b43b-719b7b0f0367", IntegrationType.DATA_CONNECT_PROVIDER),
    CLAAS_CONSUMER  ("42960b03-3259-4455-bf1b-b2c7625677bb", IntegrationType.DATA_CONNECT_CONSUMER),
    FIELDVIEW("146eaa8a-1fd3-46c2-a11e-cdbfea70e9ec", IntegrationType.DEERE_CONSUMER),
    RAVEN   ("29c25786-37f5-42d3-8fa6-3e7560e23b08", IntegrationType.CUSTOM),
    RAZOR   ("2448a795-6675-49da-b07f-bab99109b705",  IntegrationType.CUSTOM);

    private final String partnerId;
    private final IntegrationType partnerType;

    IntegrationPartner(String partnerId, IntegrationType partnerType) {
        this.partnerId = partnerId;
        this.partnerType = partnerType;
    }

    public String getPartnerId() {
        return this.partnerId;
    }

    public IntegrationType getPartnerType() {
        return partnerType;
    }
}
