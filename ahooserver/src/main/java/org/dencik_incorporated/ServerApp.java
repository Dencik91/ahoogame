package org.dencik_incorporated;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {

    static Player player1;
    static Player player2;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Server started");
        ServerSocket serverSocket = new ServerSocket(10001);
        // connection
        Socket clientSocket = serverSocket.accept();
        ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());
        Frame frame = (Frame) ois.readObject();

        if (frame.getHeader().equals("connect")) {
            System.out.println("PLAYER CONNECTED: "
                    + ((Player)frame.getBody()).getNickName());
            player1 = (Player)frame.getBody();
        }

        clientSocket = serverSocket.accept();
        ois = new ObjectInputStream(clientSocket.getInputStream());
        frame = (Frame) ois.readObject();

        if (frame.getHeader().equals("connect")) {
            System.out.println("PLAYER CONNECTED: "
                    + ((Player)frame.getBody()).getNickName());
            player2 = (Player)frame.getBody();
        }

        ois.close();
        clientSocket.close();
        serverSocket.close();

    }
}
