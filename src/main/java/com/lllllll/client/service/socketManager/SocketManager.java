package com.lllllll.client.service.socketManager;

import com.lllllll.entity.ClientRequest;
import com.lllllll.entity.RequestType;
import com.lllllll.entity.Response;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class SocketManager {
    private String ip = "localhost";
    private final int port;

    public SocketManager(String ip , int port) {
        this.port = port;
        this.ip = ip;
    }

    public SocketManager(int port) {
        this.port = port;
    }




    public Response sendRequest(Object body, RequestType requestType) throws IOException {
        Socket socket = null;
        try {
            socket = new Socket(ip, port);


            ObjectOutputStream  out = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());

            ClientRequest request = new ClientRequest(body, requestType);

            out.writeObject(request);
            out.flush();


            return (Response) in.readObject();
        }
        catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        finally {
            socket.close();
        }

        return null;
    }
}

