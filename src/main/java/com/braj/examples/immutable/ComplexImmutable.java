package com.braj.examples.immutable;

import java.util.Objects;

public final class ComplexImmutable {
    private final double re;
    private final double im;

    public ComplexImmutable(double re, double im) {
        this.re = re;
        this.im = im;
    }

    // No setters and getters
    public double realPart(){
        return re;
    }

    public double imaginaryPart(){
        return im;
    }


    // Note that the method is not modifying existing Object rather Creating new Object
    public ComplexImmutable plus(ComplexImmutable c){
        return new ComplexImmutable(re+c.re , im +c.im);
    }

    // Note that the method is not modifying existing Object rather Creating new Object
    public ComplexImmutable minus(ComplexImmutable c){
        return new ComplexImmutable(re-c.re , im -c.im);
    }

    // Note that the method is not modifying existing Object rather Creating new Object
    public ComplexImmutable times(ComplexImmutable c){
        return new ComplexImmutable(re*c.re , im*c.im);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexImmutable that = (ComplexImmutable) o;
        return Double.compare(that.re, re) == 0 &&
                Double.compare(that.im, im) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }

    @Override
    public String toString() {
        return "ComplexImmutable{" +
                "re=" + re +
                ", im=" + im +
                '}';
    }
}
