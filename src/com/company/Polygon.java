package com.company;

public class Polygon extends Shape {
    private int f;

    public Polygon(int a, int f) {
        super(a);
        this.f = f;
    }

    @Override
    public double getPerimeter() {
        System.out.println(getA() * f);
        return 0;
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "f=" + f +
                '}';
    }
}
