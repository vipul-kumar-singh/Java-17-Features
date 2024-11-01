package com.vkstech.java17features.sealed;

/**
 * Subclasses of sealed classes need to be final
 */
public final class Square extends Shape {

    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square with side " + side;
    }
}
