package com.braj.examples.tcp_server;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Would not get MemoryOutOf bound exception as there is only a fixed number of connections allowed.
// Problem here is : Only 10 Connects can be accepted at a time. If there are more , they will be in a internal Queue.
// Only once all in_progress are done the new one will be accepted.
public class BlockingServerWithThreadPool_3 {

    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8080);
            ExecutorService pool = Executors.newFixedThreadPool(10);
            System.out.println("Server Started");
            while (true) {
                System.out.println("Current Pool : " + pool.toString());
                Socket socket = ss.accept();
                System.out.println("socket = " + socket);
                pool.submit(() -> handle(socket));
                //new Thread(() -> handle(socket)).start();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void handle(Socket socket)  {
        try(InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();){
            int data;
            while((data = inputStream.read()) != -1){ // -1 Means end of line/data.
                System.out.println("Data received from Socket: "+data);
                outputStream.write(data); // Just returning the same data
                while(true){

                    //Eveery 6 sec , check file system for any command
                    //outputStream.write(data);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
