package com.company;

public class Semicircle extends Shape {

    private static final double PI = Math.PI;

    public Semicircle(int a) {
        super(a);
    }

    @Override
    public double getPerimeter() {
        System.out.println((Math.PI * getA()) + 2 * getA());
        return 0;
    }

    @Override
    public String toString() {
        return "Semicircle{}";
    }
}
