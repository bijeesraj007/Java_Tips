package com.braj.examples.multi_threading.atomicInteger;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;


// Atomic Int is thread Safe .
// Even though 10 threads are working on the same variable,  no thread is stepping on  the other
// & more importantly each thread is getting the most latest value that was updated by the other thread.
// Instead of atomicInt if you use "int" you will see each thread is working on its own copy if "value" and no thread is sharing the updated value.
public class AtomicIntExampleMain {

    public static void main(String[] args) {
        AtomicInteger value = new AtomicInteger();
        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        for (int i = 0; i <10 ; i++) {
            //new Thread(new CounterTask(value)).start(); Or
            threadPool.submit(new CounterTask(value));
        }
        threadPool.shutdown();
    }


    static class CounterTask implements Runnable{
        private AtomicInteger value;

        public CounterTask(AtomicInteger value) {
            this.value=value;
        }

        @Override
        public void run() {
            System.out.println(value.incrementAndGet());
        }
    }
}


