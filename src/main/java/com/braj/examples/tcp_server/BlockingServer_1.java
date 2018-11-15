package com.braj.examples.tcp_server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

// Single Threaded
// Problem here is when a client is connected that is a blocked connection.
// NO one else can connect until the first client connection is closed.
public class BlockingServer_1 {

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8080);
        System.out.println("Server Started");
        while(true){
            Socket socket = ss.accept(); // Blocking
            handle(socket);
        }
    }


    private static void handle(Socket socket) throws IOException {
        try(InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream()){
            int data;
            while((data = inputStream.read()) != -1){ // -1 Means end of line/data.
                outputStream.write(data); // Just returning the same data
            }
        }

    }
}
