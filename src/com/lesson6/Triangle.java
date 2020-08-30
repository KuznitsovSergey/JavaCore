package com.lesson6;

public class Triangle extends Figure {

    private double area;

    public Triangle(double height, double side) {
        super(height, side);
    }

    public Triangle(int area, double side) {
        super(area, side);
        this.area = area;
    }

    @Override
    public String Area() {
        return String.valueOf(getHeight() * getSide() / 2);
    }

    public double heightTriangle() {
        return area * 2 / getSide();
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "area=" + area +
                "} " + super.toString();
    }
}
