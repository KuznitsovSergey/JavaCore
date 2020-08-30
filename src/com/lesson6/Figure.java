package com.lesson6;

public abstract class Figure implements СalculationAreas {

    private double height;
    private double side;
    private double diagonal;

    public Figure(double height, double side) {
        this.height = height;
        this.side = side;
    }

    public Figure(double diagonal) {
        this.diagonal = diagonal;
    }

    public Figure(int height1, int height2, int height3) {
    }

    public double getHeight() {
        return height;
    }
    public double getSide() {
        return side;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "height=" + height +
                ", side=" + side +
                ", diagonal=" + diagonal +
                '}';
    }
}
