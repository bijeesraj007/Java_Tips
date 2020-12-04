package com.braj.examples.multi_threading.countdownlatch_if_allthreadscompleted;

import org.omg.CORBA.TIMEOUT;

import java.util.concurrent.*;


// Take a look : //https://www.baeldung.com/java-countdown-latch
public class Main {

    public static void main(String[] args) {
        // Max 10 Thread. Rest will wait for current thread to complete
        // Executors has other static method to create thread pool using different ways. In each thread works differently.
        // generally we can use  newFixedThreadPool(xx);

        int THREAD_COUNT = 10;

        ExecutorService threadPool = Executors.newFixedThreadPool(THREAD_COUNT);
    }


}
