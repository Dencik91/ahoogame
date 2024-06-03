package org.dencik_incorporated;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientApp
{
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost", 10001);
        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        // Create player
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your NickName");
        String nickname = scanner.next();
        Player player = new Player(nickname, 0);

        Frame frame = new Frame("connect", player);

        oos.writeObject(frame);
        oos.close();
        socket.close();
        System.out.println("Client: sent frame");
    }


}
