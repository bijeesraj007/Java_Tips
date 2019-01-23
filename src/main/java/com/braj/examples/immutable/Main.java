package com.braj.examples.immutable;

public class Main {

    public static void main(String[] args) {

        ComplexImmutable complexImmutable = new ComplexImmutable(10,5);
        System.out.println("Original complexImmutable = " + complexImmutable);

        ComplexImmutable complexImmutableModified= complexImmutable.plus(new ComplexImmutable(1,1));
        System.out.println("Another Object  = " + complexImmutableModified);
    }
}
