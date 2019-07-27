package com.braj.examples.recursion;

public class FactorialMain {

    public static void main(String[] args) {
        FactorialMain factorialMain = new FactorialMain();
        int inputNumber = 3;
        System.out.printf("Result:" + factorialMain.factorical(inputNumber));
    }

    private long factorical(long input){
        if(input ==0)
            return 0;
        else if(input ==1)
            return 1;
        else
            return (input * factorical(input-1));
    }
}
