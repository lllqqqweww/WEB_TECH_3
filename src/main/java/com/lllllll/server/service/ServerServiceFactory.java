package com.lllllll.server.service;

import com.lllllll.server.service.Impl.ServerServiceImpl;

public final class ServerServiceFactory {
    private static final ServerServiceFactory instance = new ServerServiceFactory();
    private final ServerService serverService = new ServerServiceImpl();

    private ServerServiceFactory() {}


    public ServerService getServerService() {

        return serverService;
    }


    public static ServerServiceFactory getInstance() {
        return instance;
    }

}
