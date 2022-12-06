package com.lllllll.server.service.serverLauncher;

import com.lllllll.server.service.socketHandler.SocketHandler;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    private final int port;
    private List<SocketHandler> clients = new ArrayList<>();

    public Server(int port){
        this.port = port;
    }

    public void launchAndWait() throws IOException {
        try (ServerSocket server = new ServerSocket(port)) {
            while (true) {
                Socket socket = server.accept();
                try {
                    clients.add(new SocketHandler(socket));
                } catch (IOException e) {
                    socket.close();
                }
            }
        }
    }
}
