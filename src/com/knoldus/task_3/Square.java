package com.knoldus.task_3;

public class Square implements Shape {
    private double side; // Represents the side length of the square

    // Set the dimensions of the square
    public void setDimensions(double side, double width) {
        this.side = side;
    }

    // Calculate and return the area of the square
    public double getArea() {
        return side * side;
    }
}
