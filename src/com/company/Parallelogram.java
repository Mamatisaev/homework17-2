package com.company;

public class Parallelogram extends Shape {
    private int b;

    public Parallelogram(int a, int b) {
        super(a);
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        System.out.println(2 * (getA() * b));
        return 0;
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                "b=" + b +
                '}';
    }
}
