package org.acme;


public class ContractListener {

    @Inject
    ContractResource contractResource;

    @Incoming("contract")
    public void consume(Contract contract) {
        contractResource.create(contract);
    }

}
