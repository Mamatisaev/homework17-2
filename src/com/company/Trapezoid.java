package com.company;

public class Trapezoid extends Shape {
    private int c;
    private int d;
    private int e;

    public Trapezoid(int a, int c, int d, int e) {
        super(a);
        this.c = c;
        this.d = d;
        this.e = e;
    }

    @Override
    public double getPerimeter() {
        System.out.println(getA() + c + d + e);
        return 0;
    }

    @Override
    public String toString() {
        return "Trapezoid{" +
                "c=" + c +
                ", d=" + d +
                ", e=" + e +
                '}';
    }
}
