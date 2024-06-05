package org.dencik_incorporated;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class ServerApp {


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<String> names = new ArrayList<>();
        names.add("James");
        names.add("Anton");
        names.add("John");
        names.add("Oleg");
        names.add("Jake");

        names.removeIf( name -> name.toString().startsWith("J"));
        //names.removeIf(new Printer<>()::test); hueta

        names.forEach(System.out::println);

    }
}

