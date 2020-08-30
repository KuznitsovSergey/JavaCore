package com.lesson6;

public class Parallelogram extends Figure {


    public Parallelogram(double height, double side) {
        super(height, side);
    }

    @Override
    public String Area() {
        return String.valueOf(getHeight() * getSide());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
