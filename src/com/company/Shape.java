package com.company;

public abstract class Shape {

    private int a;


    public Shape(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }

public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape - " +
                "a = " + a;
    }
}
