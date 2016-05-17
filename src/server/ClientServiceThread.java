package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientServiceThread implements Runnable {

    private Socket clientSocket;
    private int clientId = -1;
    private boolean running = true;

    public ClientServiceThread(Socket clientSocket, int clientId) {
        this.clientSocket = clientSocket;
        this.clientId = clientId;
    }

    @Override
    public void run() {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

            while (running) {

            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
