package com.braj.examples.multi_threading.future_3;

import java.util.Random;
import java.util.concurrent.Callable;

public class RandomNumberGenerator implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        return random();
    }

    public Integer random(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Integer randomNumber = new Random().nextInt(500000);
        System.out.println("randomNumber = " + randomNumber);
        return randomNumber;
    }
}
