package com.vkstech.java17features.sealed;

/**
 * Sealed classes allow you to restrict which classes can extend or implement them.
 * Only specified classes can be direct subclasses, which improves control over the class hierarchy.
 */
public abstract sealed class Shape permits Circle, Rectangle, Square {

    public abstract double area();

}
