package com.braj.examples.immutable;

public class Main {


    //1. Here Any Operation on existing Object will not change the State . Instead it returns a new Object after applying the operation.
    //2. Thread Safe By default. No need of synchronization.


    /**
     * @param args
     */
    public static void main(String[] args) {

        ComplexImmutable complexImmutable = new ComplexImmutable(10,5);
        System.out.println("Original complexImmutable = " + complexImmutable);

        ComplexImmutable complexImmutableModified= complexImmutable.plus(new ComplexImmutable(1,1));
        System.out.println("Another Object  = " + complexImmutableModified);
    }
}
