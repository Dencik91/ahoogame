package org.dencik_incorporated;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class ServerApp {


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Set<Player> players = new HashSet<>();

        players.add(new Player("jon", 10));
        players.add(new Player("pete", 100));
        players.add(new Player("jon", 20));
        players.add(new Player("mat", 100));

        players.forEach(ServerApp::printInBrackets);

        CustomSet<String> experimental = new CustomSet<>();
        experimental.add("Dencik");
        experimental.add("Mujic");
        experimental.add("Serios");
        experimental.forEach(System.out::println);


    }

    public static void printInBrackets(Player player) {
        System.out.println("[" + player + "]");
    }
}


