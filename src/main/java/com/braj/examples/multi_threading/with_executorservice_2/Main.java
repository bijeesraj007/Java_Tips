package com.braj.examples.multi_threading.with_executorservice_2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        // Max 10 Thread. Rest will wait for current thread to complete
        // Executors has other static method to create thread pool using different ways. In each thread works differently.
        // generally we can use  newFixedThreadPool(xx);

        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        for (int i = 0; i <100 ; i++) {
            threadPool.submit(new Task(i));
        }
    }
}
