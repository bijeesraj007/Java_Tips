package com.braj.examples.multi_threading.old_Fashioned_1;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) { // Bad ! it creates 100 Threads. Not effectively utilising
            new Thread(new Task(i)).start(); // If there are 1000's of threads . it would will be Server.
        }
    }
}
