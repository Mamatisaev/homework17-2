package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter your four numbers.");
        int one = scan.nextInt();
        int two = scan.nextInt();
        int three = scan.nextInt();
        int four = scan.nextInt();

        System.out.println("Perimeter of a Semicircle");
        Shape shape1 = new Semicircle(one);
        shape1.getPerimeter();

        System.out.println("Perimeter of a Parallelogram");
        Shape shape2 = new Parallelogram(one, two);
        shape2.getPerimeter();

        System.out.println("Perimeter of a Trapezoid");
        Shape shape3 = new Trapezoid(one, two, three, four);
        shape3.getPerimeter();

        System.out.println("Perimeter of a Rhombus");
        Shape shape4 = new Rhombus(one);
        shape4.getPerimeter();

        System.out.println("Perimeter of a Polygon");
        Shape shape5 = new Polygon(one, two);
        shape5.getPerimeter();


    }
}
