package com.ocp.examtopics;

public class Question64 {
}

abstract class Shape {
    Shape() {
        System.out.println("Shape");
    }

    protected void area() {
        System.out.println("Shape");
    }
}

class Square extends Shape {
    int side;

    Square(int side) {
        /* insert code here */
        this.side = side;
    }

    public void area() {
        System.out.println("Square");
    }
}

class Rectangle extends Square {
    int len, br;

    Rectangle(int x, int y) {
        super(x);
        len = x;
        br = y;
    }

    public void area() {
        System.out.println("Rectangle");
    }
}
