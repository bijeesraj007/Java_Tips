package com.braj.examples.multi_threading.future_3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(50);

        try {
            long start = System.currentTimeMillis();
            //Both below statements will be running in parallel.
            Future<String> randomFutureString = threadPool.submit(new RandomStringGenerator()); // task takes 5 Sec
            Future<Integer> randomFutureNumber = threadPool.submit(new RandomNumberGenerator()); // task takes 3 second
            System.out.println("Initiated to generated RandomString and RandomNumber");

            // get() on future is the only blocking call.
            // At this time if the previously initiated call is not done , the sout will wait.
            System.out.println("Random String : " + randomFutureString.get() + " *** " + "Random Number = " + randomFutureNumber.get());

            long elapsedTime = System.currentTimeMillis() - start;
            System.out.println("Elapsed Time :" + elapsedTime);
            // Note that though 5 sec + 3 sec is the execution time for each method , the elapsed time is only 5 sec (NOT 8 Sec).

        }finally {
            threadPool.shutdown(); // Make sure to close once done
        }

    }
}
