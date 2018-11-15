package com.braj.examples.multi_threading.with_executorservice_2;

import java.util.Random;

public class Task implements Runnable {

    int count;

    public Task(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(new Random().nextInt(500)); // Random wait
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Doing the Job : " + count);
    }
}
