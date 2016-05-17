package server;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {

    private static ServerSocket serverSocket;

    public static void main(String[] args) {

        try {
            serverSocket = new ServerSocket(Integer.parseInt(args[0]));
        } catch (IOException e) {
            System.err.println("Cannot bind socket on given port!");
            e.printStackTrace();
        }

    }

}
