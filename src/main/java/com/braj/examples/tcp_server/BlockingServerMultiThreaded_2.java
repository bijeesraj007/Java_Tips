package com.braj.examples.tcp_server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.net.ServerSocket;
import java.net.Socket;

// Multi Threaded. Each Connection will be handed over to a Thread.
// Problem is if there are a lot of Clients trying to connect ,each one will create a thread .
// This will encounter MemoryOutOfBound exception as the OS has finite number of threads that can be supported.
public class BlockingServerMultiThreaded_2 {

    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8080);
            System.out.println("Server Started");
            while (true) {
                Socket socket = ss.accept(); // Blocking
                System.out.println("socket = " + socket);
                new Thread(() -> handle(socket)).start();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void handle(Socket socket) {
        try(InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();){
            int data;
            while((data = inputStream.read()) != -1){ // -1 Means end of line/data.
                  System.out.println("Data received from Socket: "+data);
                  outputStream.write(data); // Just returning the same data
            }
        }catch (IOException e){
            throw new UncheckedIOException(e);
        }

    }


    private static void sleep(long waitTime){
        try {
            Thread.sleep(waitTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



