package com.vkstech.java17features.sealed;

public final class Rectangle extends Shape {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle with length " + length + " and width " + width;
    }
}
