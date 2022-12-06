package com.lllllll.server.DAO;

import com.lllllll.server.DAO.Impl.ServerDAOImpl;

public final class ServerDAOFactory {

        private static final ServerDAOFactory instance = new ServerDAOFactory();
        private final ServerDAO serverDAO = new ServerDAOImpl();

        private ServerDAOFactory() {}

        public ServerDAO getServerDAO() {
            return serverDAO;
        }

        public static ServerDAOFactory getInstance() {
            return instance;
        }
    }

