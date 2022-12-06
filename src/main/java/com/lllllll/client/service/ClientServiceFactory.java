package com.lllllll.client.service;

import com.lllllll.client.service.Impl.ClientServiceImpl;

public final class ClientServiceFactory {
    private static final ClientServiceFactory instance = new ClientServiceFactory();
    private final ClientService clientService = new ClientServiceImpl();

    private ClientServiceFactory() {}


    public ClientService getClientService() {
        return clientService;
    }


    public static ClientServiceFactory getInstance() {
        return instance;
    }

}
