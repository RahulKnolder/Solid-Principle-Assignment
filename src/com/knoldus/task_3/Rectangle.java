package com.knoldus.task_3;

public class Rectangle implements Shape {
    private double length; // Represents the length of the rectangle
    private double width; // Represents the width of the rectangle

    // Set the dimensions of the rectangle
    public void setDimensions(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Calculate and return the area of the rectangle
    public double getArea() {
        return length * width;
    }
}
