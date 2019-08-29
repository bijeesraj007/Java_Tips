package com.braj.examples.recursion;

public class FibonacciMain {


    public static void main(String[] args) {
        FibonacciMain fibonacciMain = new FibonacciMain();
        System.out.println("Fibonacci : " + fibonacciMain.fibonacci(120));
    }

    long fibonacci(int n){
        System.out.println("Calculating Fibonacci for :" + n);
        if(n<=1)
            return n;
        return fibonacci(n-1) + fibonacci(n-2);

    }
}
