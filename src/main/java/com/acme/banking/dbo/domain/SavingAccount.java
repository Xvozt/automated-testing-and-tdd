package com.acme.banking.dbo.domain;

import java.util.UUID;

public class SavingAccount implements Account {
    private UUID id;
    private Client client;
    private double amount;

    public SavingAccount(UUID id, Client client, double amount) {
        if (client == null) throw new IllegalArgumentException("client cannot be null");
        if (id == null) throw new IllegalArgumentException("id cannot be null");
        this.id = id;
        this.client = client;
        this.amount = amount;
    }
    @Override
    public Client getClient() {
        return client;
    }

    @Override
    public void setClient(Client client) {
        this.client = client;
    }
    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public UUID getClientId() {
        return client.getId();
    }
}
