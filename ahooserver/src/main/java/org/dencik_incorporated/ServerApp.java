package org.dencik_incorporated;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServerApp {


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Player> players = new ArrayList<>();

        players.add(new Player("valerca", 100));
        players.add(new Player("iurii", 3));
        players.add(new Player("jenel", 1));

        players.forEach(ServerApp::printInBrackets);

    }

    public static void printInBrackets(Player player) {
        System.out.println("[" + player + "]");
    }
}
