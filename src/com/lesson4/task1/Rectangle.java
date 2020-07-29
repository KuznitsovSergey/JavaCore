package com.lesson4.task1;

public class Rectangle {
    private final Point upperLeftPoint;
    private final Point lowerRightPoint;

    public Rectangle(Point upperLeftPoint, Point lowerRightPoint) {
        this.upperLeftPoint = upperLeftPoint;
        this.lowerRightPoint = lowerRightPoint;
    }

    public int getArea() {
        int lengthSide1 = upperLeftPoint.getX() - lowerRightPoint.getX();
        int lengthSide2 = lowerRightPoint.getY() - upperLeftPoint.getY();
        return lengthSide1 * lengthSide2;
    }

    public double getDiagonal() {
        return upperLeftPoint.distance(lowerRightPoint);
    }
}
