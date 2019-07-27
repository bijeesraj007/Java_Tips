package com.braj.examples.recursion;

public class FactorialMain {

    public static void main(String[] args) {
        FactorialMain factorialMain = new FactorialMain();
        int inputNumber = 6;
        System.out.printf("Result:" + factorialMain.factorical(inputNumber));
    }

    private int factorical(int input){
        if(input ==0)
            return 0;
        else if(input ==1)
            return 1;
        else
            return (input * factorical(input-1));
    }
}
