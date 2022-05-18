package com.company;

public class Rhombus extends Shape {
    public Rhombus(int a) {
        super(a);
    }

    @Override
    public double getPerimeter() {
        System.out.println(4 * getA());
        return 0;
    }

    @Override
    public String toString() {
        return "Rhombus{}";
    }
}
