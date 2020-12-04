package com.braj.examples.multi_threading.countdownlatch_if_allthreadscompleted;

import java.util.Random;

//https://www.baeldung.com/java-countdown-latch
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
