package com.braj.examples.multi_threading.completablefuture_4;

import java.util.concurrent.CompletableFuture;

// When a single task contains multiple steps , using Future may not be a good solution.
// As each step is depended on previous step. Hence without completing one order it can't get into a new order
// CompletableFuture is the solution here to run each order in Async manner.

public class CompletableFutureExampleMain {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        for (int i = 0; i <10 ; i++) {
            // all steps for a single order is done by 1 thread.
            // Other orders is running in parallel at the same time.
            // Internally its using Executor Service
            // Each has a sleep of 3 sec in email sending Operation.
            CompletableFuture.supplyAsync(()->getOrder())
                             .thenApply(order->enrichOrder(order))
                             .thenApply(order -> enrichOrder(order))
                             .thenApply(order -> makePayment(order))
                             .thenApply(order -> sendEmail(order));
            System.out.println("Completed :" +i);
        }

        long elapsedTime =  System.currentTimeMillis()-start;
        System.out.println("elapsedTime = " + elapsedTime); // It did not take 30 sec . Rather it took only 10 sec max.
    }

    public static Order getOrder(){
        return new Order();
    }

    public static Order enrichOrder(Order order){
        order.setOrderType("A");
        return order;
    }

    public static Order makePayment(Order order){
        order.setPayment(true);
        return order;
    }

    public static Order sendEmail(Order order){
        order.setDesc("Email Sent");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return order;
    }

}



