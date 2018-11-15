package com.braj.examples.multi_threading.future_3;

import org.apache.commons.lang.RandomStringUtils;

import java.util.concurrent.Callable;

public class RandomStringGenerator implements Callable<String> {

    @Override
    public String call() throws Exception {
        return random();
    }

    public String random(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String randomString = RandomStringUtils.random(25,true,false);
        System.out.println("randomString = " + randomString);
        return randomString;
    }

}
