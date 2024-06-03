package org.dencik_incorporated;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class ServerApp {


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket serverSocket = new ServerSocket(10001);

        Map<String, Object> playerSocketMap = new HashMap<>();

        playerSocketMap.put("socket", new Socket());

        playerSocketMap.put("socket", new Socket("localhost", 10001));
        playerSocketMap.put("player", new Player("jimmy", 0));

        System.out.println(playerSocketMap.size());
        System.out.println(playerSocketMap.get("player"));
        System.out.println(playerSocketMap.get("socket"));

    }

    public static void printPair(String key, Object value) {
        System.out.println(key + value);;
    }
}
