package com.braj.examples.tcp_server;

import java.net.Socket;

public class ClientSendingMultipleSockets {

    public static void main(String[] args) throws  InterruptedException {
        Socket[] sockets = new Socket[1000];
            for (int i = 0; i < sockets.length - 1; i++) {
                System.out.println("i = " + i);       
                try {
                    sockets[i] = new Socket("localhost", 7001);
                    sockets[i].getOutputStream().write(i);
                    //sockets[i].close();
                   // System.out.println("##"+sockets[i].getInputStream().read());
                }catch (Exception e){
                    System.err.println(e);
                }
            }

        Thread.sleep(100000000);
    }


}
